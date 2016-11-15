package com.dodgeball.trackouts


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Venue {
    String name
    String address

    static hasMany = [courts: Court]
}