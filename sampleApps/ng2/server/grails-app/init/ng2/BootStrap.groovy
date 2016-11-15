package ng2

import com.dodgeball.trackouts.Court
import com.dodgeball.trackouts.Match
import com.dodgeball.trackouts.Player
import com.dodgeball.trackouts.Team
import com.dodgeball.trackouts.Tournament
import com.dodgeball.trackouts.Venue

class BootStrap {

    def init = { servletContext ->
        Venue venue = new Venue(
                name: 'Digital Court',
                address: 'The Internet'
        ).save()

        Court court1 = new Court(
                name: 'Court 1',
                venue: venue
        ).save()

        Court court2 = new Court(
                name: 'Court 2',
                venue: venue
        ).save()

        Tournament tournament = new Tournament(
                startDate: new Date() + 7,
                endDate: new Date() + 8,
                venue: venue
        ).save()

        Team boosh = new Team(
                teamName: 'Boosh',
                homeCity: 'Minneapolis'
        ).save(failOnError: true)

        addPlayersToTeam(boosh)

        Team blitz = new Team(
                teamName: 'Blitz',
                homeCity: 'St. Paul'
        ).save(failOnError: true)

        addPlayersToTeam(blitz)

        Team bar = new Team(
                teamName: 'Bar',
                homeCity: 'The Web'
        ).save(failOnError: true)

        addPlayersToTeam(bar)

        Team baz = new Team(
                teamName: 'Baz',
                homeCity: 'The Net'
        ).save(failOnError: true)

        addPlayersToTeam(baz)

        tournament.addToTeams(boosh)
        tournament.addToTeams(blitz)
        tournament.addToTeams(bar)
        tournament.addToTeams(baz)

        Match match1 = new Match (
                tournament: tournament,
                homeTeam: boosh,
                awayTeam: blitz,
                court: court1,
                startTime: tournament.startDate,
                endTime: tournament.endDate
        )
        match1.save(failOnError: true)

        Match match2 = new Match (
                tournament: tournament,
                homeTeam: bar,
                awayTeam: baz,
                court: court2,
                startTime: tournament.startDate,
                endTime: tournament.endDate
        )
        match2.save(failOnError: true)

        Match match3 = new Match (
                tournament: tournament,
                homeTeam: boosh,
                awayTeam: bar,
                court: court1,
                startTime: tournament.startDate,
                endTime: tournament.endDate
        )

        match3.save(failOnError: true)

        Match match4 = new Match (
                tournament: tournament,
                homeTeam: baz,
                awayTeam: blitz,
                court: court2,
                startTime: tournament.startDate,
                endTime: tournament.endDate
        )
        match4.save(failOnError: true)

        tournament.save()


    }
    def destroy = {
    }
    
    
    def addPlayersToTeam(Team team) {
        String[] firstNames = [
                'Eric', 'Cody', 'Charlie', 'Isaac', 'Will',
                'Jay', 'Jake', 'Alex', 'Tanja', 'Ashley',
                'Willie', 'Jeremy', 'Ray', 'Tony', 'Marjan',
                'Katie', 'Adam', 'Patrick', 'Karl', 'Max'
        ]
        String[] lastNames = [
                'Anderson', 'Jones', 'Smith', 'Sanu', 'Hopkins',
                'Wu', 'Muhammad', 'Bernard', 'Carr', 'Burkowski'
        ]

        5.times {
            Player p = new Player(
                    firstName: firstNames[Math.floor(Math.random() * 100) % firstNames.length as int],
                    lastName: lastNames[Math.floor(Math.random() * 100) % lastNames.length as int],
                    team: team,
                    jerseyNumber: (Math.floor(Math.random() * 100) as int).toString()
            )
            p.save(failOnError: true)
        }
    }


}
