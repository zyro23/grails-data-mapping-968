package myapp

import grails.gorm.services.Service
import grails.gorm.services.Where

@Service(Dummy)
interface DummyDataService {

	@Where({
		dummyChild.name == childName
	})
	Dummy doFind(String childName)

}
