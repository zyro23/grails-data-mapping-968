package myapp

import grails.gorm.transactions.Transactional

@Transactional
class DummyService {

	void init() {
		new Dummy(name: "dummy", dummyChild: new DummyChild(name: "child")).save()
	}

	Dummy doFind(String childName) {
		Dummy dummy = Dummy.where {
			dummyChild.name == childName
		}.find()
		return dummy
	}

}
