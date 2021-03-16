package racingcar.ui

object InputView {

    fun getNumberOfCars(): Int {
        println("자동차 대수는 몇 대인가요?")
        return readLine()?.toInt() ?: 0
    }

    fun getTryCounts(): Int {
        println("시도할 횟수는 몇 회인가요?")
        return readLine()?.toInt() ?: 0
    }
}