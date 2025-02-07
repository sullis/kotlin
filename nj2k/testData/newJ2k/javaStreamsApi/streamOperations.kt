import java.util.stream.Collectors

internal class Test {
    fun main(lst: List<Int>) {
        val newLst = lst.stream()
                .filter { x: Int -> x > 10 }
                .map { x: Int -> x + 2 }
                .distinct()
                .sorted()
                .sorted(Comparator.naturalOrder())
                .peek { x: Int? -> println(x) }
                .limit(1)
                .skip(42)
                .collect(Collectors.toList())
    }
}