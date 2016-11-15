package com.dodgeball.trackouts


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Player {
    String firstName
    String lastName
    String emailAddress
    String jerseyNumber

    Team team

    static hasMany = [stats: Statistic]

    static constraints = {
        emailAddress nullable: true
    }
}