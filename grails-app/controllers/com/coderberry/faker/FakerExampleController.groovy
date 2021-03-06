package com.coderberry.faker

class FakerExampleController {
    def fakerService

    def index() {

        def exampleData = [:]

/* -- HELPERS -- */
        exampleData["fakerService.numerify('#####')"] = fakerService.numerify('#####')
        exampleData["fakerService.letterify('??? ???')"] = fakerService.numerify('#####')
        exampleData["fakerService.bothify('##? ?##')"] =

/* -- NAME -- */
        exampleData["fakerService.name()"] = fakerService.name()
        exampleData["fakerService.firstName()"] = fakerService.firstName()
        exampleData["fakerService.lastName()"] = fakerService.lastName()
        exampleData["fakerService.esFirstNameMale()"] = fakerService.esFirstNameMale()
        exampleData["fakerService.esFirstNameFemale()"] = fakerService.esFirstNameFemale()
        exampleData["fakerService.esFirstName()"] = fakerService.esFirstName()
        exampleData["fakerService.esLastName()"] = fakerService.esLastName()
        exampleData["fakerService.esName()"] = fakerService.esName()

/* -- ADDRESS -- */
        exampleData["fakerService.streetAddress()"] = fakerService.streetAddress()
        exampleData["fakerService.streetName()"] = fakerService.streetName()
        exampleData["fakerService.secondaryAddress()"] = fakerService.secondaryAddress()
        exampleData["fakerService.city()"] = fakerService.city()
        exampleData["fakerService.usState()"] = fakerService.usState()
        exampleData["fakerService.usStateAbbr()"] = fakerService.usStateAbbr()
        exampleData["fakerService.zipCode()"] = fakerService.zipCode()
        exampleData["fakerService.ukCounty()"] = fakerService.ukCounty()
        exampleData["fakerService.ukCountry()"] = fakerService.ukCountry()
        exampleData["fakerService.ukPostcode()"] = fakerService.ukPostcode()
        exampleData["fakerService.esPostcode()"] = fakerService.esPostcode()
        exampleData["fakerService.esProvince()"] = fakerService.esProvince()
        

/* -- COMPANY -- */
        exampleData["fakerService.companyName()"] = fakerService.companyName()
        exampleData["fakerService.companyCatchPhrase()"] = fakerService.companyCatchPhrase()
        exampleData["fakerService.companyBS()"] = fakerService.companyBS()
        exampleData["fakerService.occupation()"] = fakerService.occupation()

/* -- INTERNET -- */
        exampleData["fakerService.email()"] = fakerService.email()
        exampleData["fakerService.email('Joe Blow')"] = fakerService.email('Joe Blow')
        exampleData["fakerService.freeEmail()"] = fakerService.freeEmail()
        exampleData["fakerService.freeEmail('Joe Blow')"] = fakerService.freeEmail('Joe Blow')
        exampleData["fakerService.userName()"] = fakerService.userName()
        exampleData["fakerService.userName('Joe Blow')"] = fakerService.userName('Joe Blow')
        exampleData["fakerService.domainName()"] = fakerService.domainName()

/* -- LOREM -- */
        exampleData["fakerService.sentence(3)"] = fakerService.sentence(3)
        exampleData["fakerService.paragraph(3)"] = fakerService.paragraph(3)
        exampleData["fakerService.word()"] = fakerService.word()
        exampleData["fakerService.wordCapital()"] = fakerService.wordCapital()

/* -- PHONE -- */
        exampleData["fakerService.phoneNumber()"] = fakerService.phoneNumber()
        exampleData["fakerService.phoneNumber('##########')"] = fakerService.phoneNumber('##########')
        exampleData["fakerService.esPhoneNumber()"] = fakerService.esPhoneNumber()
        
/* -- DATES -- */
        exampleData["fakerService.futureDate()"] = fakerService.futureDate()
        exampleData["fakerService.pastDate()"] = fakerService.pastDate()
        exampleData["fakerService.veryPastDate()"] = fakerService.veryPastDate()
        
/* -- FISCAL -- */
        exampleData["fakerService.esNIF()"] = fakerService.esNIF()

/* -- VERSION -- */
        exampleData["fakerService.version()"] = fakerService.version()

        [exampleData: exampleData]
    }

}
