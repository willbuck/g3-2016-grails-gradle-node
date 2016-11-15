package com.dodgeball.trackouts


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Tournament {
    Date startDate
    Date endDate

    Venue venue

    static hasMany = [teams: Team, matches: Match]

    static mapping = {
        teams joinTable: [name: "tournament_teams", key: 'tournament_id' ]
    }
}