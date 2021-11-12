package bug

import grails.gorm.services.Service

import javax.validation.constraints.NotNull

@Service(Bug)
abstract class BugDataService {
    abstract Bug save(Bug bug)

    void processBug(@NotNull Bug bug) {
        println bug.toString()
    }
}
