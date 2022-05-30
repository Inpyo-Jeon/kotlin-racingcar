package racing.view

import racing.domain.car.Car
import racing.domain.common.CarRaceProperty

class ResultView(private val carRaceProperty: CarRaceProperty) {

    fun printCarPositionByRound() {
        repeat(carRaceProperty.roundSize) { round ->
            println("-- [${round + 1}]회차 결과 ------")

            carRaceProperty.cars
                .map { car ->
                    printPositionByRound(car, round)
                }

            println("--------------------")
        }
    }

    private fun printPositionByRound(car: Car, round: Int) {
        println("${car.carName} : ${getForwardMoveMark(car.positionByRound[round]!!)}")
    }

    private fun getForwardMoveMark(move: Int): String {
        return MARK_FORWARD_MOVE.repeat(move)
    }

    fun printWinner(winnerCarNames: String) {
        println("${winnerCarNames}가 최종 우승했습니다.")
    }

    companion object {
        private const val MARK_FORWARD_MOVE = "> "
    }
}
