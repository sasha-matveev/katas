fun people(busStops: Array<Pair<Int, Int>>): Int {
    return busStops.sumOf { p -> p.first - p.second }
}

@Suppress("unused")
fun peopleBest(busStops: Array<Pair<Int, Int>>): Int {
    return busStops.sumOf { (f, s) -> f - s }
}

@Suppress("unused")
fun peopleBest2(busStops: Array<Pair<Int, Int>>): Int {
    return busStops.sumOf { it.first - it.second }
}
