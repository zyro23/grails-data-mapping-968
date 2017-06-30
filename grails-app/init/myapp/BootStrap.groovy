package myapp

class BootStrap {

    DummyService dummyService
    DummyDataService dummyDataService

    def init = { servletContext ->
        dummyService.init()

        assert dummyService.doFind("child").name == "dummy"

        assert dummyDataService.doFind("child").name == "dummy"
    }
    def destroy = {
    }
}
