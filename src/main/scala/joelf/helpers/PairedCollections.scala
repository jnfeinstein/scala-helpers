package joelf.helpers

object PairedCollections {
  implicit class PimpedTraversable[V](s: Traversable[V]) {
    def keyBy[K](keyFn: (V) => K): Traversable[(K, V)] = {
      s.map{ x => keyFn(x) -> x }
    }
  }

  implicit class PimpedPairedTraversable[K, V](s: Traversable[(K, V)]) {
    def reduceByKey(reduceFn: (V, V) => V): Map[K, V] = {
     s.groupBy(_._1).
      map { case (group, traversable) =>
        group -> traversable.map(_._2).reduce(reduceFn)
      }
    }
  }
}
