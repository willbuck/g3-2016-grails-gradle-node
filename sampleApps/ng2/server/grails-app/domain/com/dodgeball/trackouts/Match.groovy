package com.dodgeball.trackouts


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Match {
    // Where
    static belongsTo = [tournament: Tournament]
    Court court

    // When
    Date startTime
    Date endTime

    // Who
    Team homeTeam
    Team awayTeam
}