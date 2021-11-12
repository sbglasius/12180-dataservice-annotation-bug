package bug

import grails.gorm.transactions.Transactional

@Transactional
class BugProcessingService {

    BugDataService bugDataService

    boolean doSomething() {
        bugDataService.processBug(new Bug())
        return true
    }
}
