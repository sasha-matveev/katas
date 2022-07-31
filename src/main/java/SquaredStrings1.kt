object SquaredStrings1 {

    fun vertMirror(str: String): String {
        return str.split("\n").joinToString("\n") { s -> s.reversed() }
    }

    fun horMirror(str: String): String {
        return str.split("\n").reversed().joinToString("\n")
    }

    fun oper(func: (String) -> String, s: String): String {
        return func(s)
    }
}