package com.dodgeball.trackouts


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Team {
    String teamName
    String homeCity

    static hasMany = [players: Player]
}