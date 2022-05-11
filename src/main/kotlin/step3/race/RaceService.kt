package step3.race

import step3.CarRaceConst.ROUND_START
import step3.CarRaceConst.car
import step3.CarRaceConst.roundSize
import step3.car.Car
import step3.utils.NumberUtils.Companion.getRandomNumber
import step3.view.ResultView

class RaceService {
    private val resultView = ResultView()
    fun runRacingByRound() {
        for (round in ROUND_START..roundSize) {
            car.filter { canBeMove() }.map { move(it.value) }
            resultView.printResultByRound(round)
        }
    }
    private fun move(car: Car) {
        car.moveCount++
    }
    private fun canBeMove() = getRandomNumber() >= MOVE_CONDITION

    companion object {
        const val MOVE_CONDITION = 4
    }
}
