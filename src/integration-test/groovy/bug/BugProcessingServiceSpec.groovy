package bug

import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
@Rollback
class BugProcessingServiceSpec extends Specification {

    BugProcessingService bugProcessingService
    def setup() {
    }

    def cleanup() {
    }

    void "invoke to show bug"() {
        expect:
        bugProcessingService.doSomething()
    }
}
