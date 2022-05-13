package step3

import step3.car.CarRegistration
import step3.common.CarRaceProperty
import step3.race.RaceService
import step3.view.InputView

fun main() {
    val carRaceProperty = CarRaceProperty()
    val inputView = InputView(carRaceProperty)
    inputView.readInRoundSize()
    inputView.readInCarSize()

    val carRegistration = CarRegistration(carRaceProperty)
    carRegistration.initCars()

    val raceService = RaceService(carRaceProperty)
    raceService.runRacingByRound()
}
