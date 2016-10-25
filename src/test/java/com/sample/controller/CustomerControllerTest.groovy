package com.sample.controller

import spock.lang.Specification

/**
 * Created by susunshun on 2016/10/25.
 */
class CustomerControllerTest extends spock.lang.Specification {
    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }
}
