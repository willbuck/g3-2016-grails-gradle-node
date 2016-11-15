package com.dodgeball.trackouts


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Team {
    String teamName
    String homeCity

    static belongsTo = Tournament

    static hasMany = [players: Player, tournaments: Tournament]

    static mapping = {
        tournaments joinTable: [name: "tournament_teams", key: 'team_id' ]
    }
}