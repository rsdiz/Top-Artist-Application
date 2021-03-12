package id.rosyid.topartists.data

import id.rosyid.topartists.R
import java.time.LocalDate

object ArtistsData {
    private val artistNames = arrayListOf(
        "The Weeknd",
        "Dua Lipa",
        "Justin Bieber",
        "Ariana Grande",
        "Ed Sheeran",
        "J Balvin",
        "Drake",
        "Billie Eilish",
        "Bad Bunny",
        "Maroon 5"
    )

    private val artistGenres = arrayListOf(
        arrayListOf(
            Genre("R&B"), Genre("Alternative R&B"), Genre("Pop"), Genre("Electropop")
        ),
        arrayListOf(
            Genre("Pop"), Genre("Alternative Pop"), Genre("Dance-pop"), Genre("Dream pop"), Genre("nu-disco"), Genre("R&B"), Genre("Synth-pop")
        ),
        arrayListOf(
            Genre("Pop"), Genre("R&B")
        ),
        arrayListOf(
            Genre("Pop"), Genre("R&B")
        ),
        arrayListOf(
            Genre("Pop"), Genre("Folk-pop"), Genre("Hip hop")
        ),
        arrayListOf(
            Genre("Reggaeton"), Genre("Latin pop"), Genre("Urbano"), Genre("Hip hop")
        ),
        arrayListOf(
            Genre("Hip hop"), Genre("R&B"), Genre("Pop"), Genre("Trap"), Genre("Drill"), Genre("Dancehall")
        ),
        arrayListOf(
            Genre("Pop"), Genre("Electropop"), Genre("Dark pop")
        ),
        arrayListOf(
            Genre("Latin trap"), Genre("Reggaeton"), Genre("Alternative")
        ),
        arrayListOf(
            Genre("Pop"), Genre("Pop rock"), Genre("Funk rock"), Genre("Dance-pop"), Genre("Blue-eyed soul"), Genre("Neo soul"), Genre("Soft rock")
        )
    )

    private val artistBios = arrayListOf(
        "Abel Makkonen Tesfaye (born February 16, 1990), known professionally as the Weeknd, is a Canadian singer, songwriter, and record producer. Noted for his versatility in vocal style, music production, and eccentric presentation, the Weeknd is often cited as an influence to contemporary music, as well as by other artists.",
        "Dua Lipa (/ˈduːə ˈliːpə/; Albanian pronunciation: [ˈdua ˈlipa]; born 22 August 1995) is an English singer and songwriter. After working as a model, she signed with Warner Bros. Records in 2014 and released her eponymous debut album in 2017. The album peaked at number three on the UK Albums Chart, and yielded eight singles, including \"Be the One\", \"IDGAF\", and the UK number-one single \"New Rules\", which also peaked at number six in the US. The album has achieved platinum status worldwide. In 2018, Lipa won the Brit Awards for best British Female Solo Artist and British Breakthrough Act.",
        "Justin Drew Bieber (/ˈdʒʌstɪn-dru-ˈbiːbər/; born March 1, 1994) is a Canadian singer, songwriter and multi-instrumentalist. Bieber was signed to RBMG Records in 2008. With Bieber's debut EP My World, released in late 2009, Bieber became the first artist to have seven songs from a debut record chart on the Billboard Hot 100.",
        "Ariana Grande-Butera (/ˌɑːriˈɑːnə ˈɡrɑːndeɪ/, born June 26, 1993) is an American singer and actress. Born in Boca Raton, Florida, Grande began her career at age 15 in the 2008 Broadway musical 13. She rose to fame for her role as Cat Valentine in the Nickelodeon television series Victorious (2010–2013) and Sam & Cat (2013–2014). She subsequently signed with Republic Records in 2011 after the label's executives discovered YouTube videos of her covering songs. Her 1950s doo-wop-influenced pop and R&B debut album, Yours Truly (2013), topped the US Billboard 200 chart, while its lead single, \"The Way\", charted in the top ten of the US Billboard Hot 100. Upon release, critics compared Grande to Mariah Carey for her wide vocal range and whistle register.",
        "Edward Christopher Sheeran MBE (/ˈʃɪərən/; born 17 February 1991) is an English singer, songwriter, musician, record producer, actor, and businessman. After first recording music in 2004, he began gaining attention through YouTube. In early 2011, Sheeran independently released the extended play, No. 5 Collaborations Project. He signed with Asylum Records the same year.",
        "José Álvaro Osorio Balvín (born May 7, 1985), better known as J Balvin, is a Colombian reggaeton singer. He has been referred to as the \"Prince of Reggaeton\" (from Spanish: \"Príncipe del Reggaetón\"), and is one of the best-selling Latin music artists with sales of more than 35 million records (albums and singles) worldwide. Balvin was born in Medellín, Colombia. At age 17, he moved to the United States to learn English, where he lived in both Oklahoma and New York. He then returned to Medellín and gained popularity performing at clubs in the city.",
        "Aubrey Drake Graham (born October 24, 1986) is a Canadian rapper, singer, songwriter, actor, and entrepreneur. A prominent figure in popular music, Drake is credited for popularizing the Toronto sound. He first gained recognition as an actor on the teen drama television series Degrassi: The Next Generation (2001–2007); intent on pursuing a career in music, he left the series after releasing his debut mixtape Room for Improvement. He released two more independent projects, Comeback Season and So Far Gone, before signing to Young Money Entertainment.",
        "Billie Eilish Pirate Baird O'Connell (/ˈaɪlɪʃ/ EYE-lish; born December 18, 2001) is an American singer-songwriter. She first gained attention in 2015 when she uploaded the song \"Ocean Eyes\" to SoundCloud, which was subsequently released by the Interscope Records subsidiary Darkroom. The song was written and produced by her brother Finneas O'Connell, with whom she collaborates on music and live shows. Her debut EP, Don't Smile at Me (2017), became a sleeper hit, reaching the top 15 in the US, UK, Canada, and Australia.",
        "Benito Antonio Martínez Ocasio (born March 10, 1994), known by his stage name Bad Bunny, is a Puerto Rican rapper, singer, and songwriter. His music is often defined as Latin trap and reggaeton, but he has incorporated various other genres into his music, including rock, bachata, and soul. He is also known for his deep, slurred vocal style and his eclectic fashion sense. Throughout his career, Bad Bunny has frequently collaborated with artists such as J Balvin, Farruko, Residente, Arcángel, Jhay Cortez, and Daddy Yankee.",
        "Maroon 5 is an American pop rock band from Los Angeles, California. It currently consists of lead vocalist Adam Levine, keyboardist and rhythm guitarist Jesse Carmichael, lead guitarist James Valentine, drummer Matt Flynn, keyboardist PJ Morton and multi-instrumentalist Sam Farrar. Original members Levine, Carmichael, bassist Mickey Madden, and drummer Ryan Dusick first came together as Kara's Flowers in 1994, while they were still in high school."
    )

    private val artistAlbums = arrayListOf(
        // The Weeknd Album Lists
        arrayListOf(
            Album(
                "After Hours",
                LocalDate.of(2020, 3, 20),
                arrayListOf(
                    Song("Alone Again", "4:10", R.drawable.song_alone_again, "https://open.spotify.com/track/1he88AZd2sM9ECcNvVz6TP?autoplay=true", "https://music.youtube.com/watch?v=6ezA9WfNA4w&feature=gws_kp_track"),
                    Song("Too Late", "4:00", R.drawable.song_too_late, "https://open.spotify.com/track/2K9Ovn1o2bTGqbsABGC6m3?autoplay=true", "https://music.youtube.com/watch?v=NhdUBikQlQA&feature=gws_kp_track"),
                    Song("Hardest To Love", "3:31", R.drawable.song_hardest_to_love, "https://open.spotify.com/track/6kWxIqQDsKFYCJGbU4AjCX?autoplay=true", "https://music.youtube.com/watch?v=0-VsfvI6OVc&feature=gws_kp_track"),
                    Song("Scared To Live", "3:11", R.drawable.song_scared_to_live, "https://open.spotify.com/track/4BGZF4oLbTL0pWm7C18pbv?autoplay=true", "https://music.youtube.com/watch?v=TJ5dk8Qy39w&feature=gws_kp_track"),
                    Song("Snowchild", "4:07", R.drawable.song_snowchild, "https://open.spotify.com/track/6SJbe5dxOdk8NQ3cB5kr3m?autoplay=true", "https://music.youtube.com/watch?v=FxrUrgAOIhM&feature=gws_kp_track"),
                    Song("Escape From LA", "5:56", R.drawable.song_escape_from_la, "https://open.spotify.com/track/1sOW4PuG5X3Ie3EXUhAopJ?autoplay=true", "https://music.youtube.com/watch?v=MtjvCAZTVnc&feature=gws_kp_track"),
                    Song("Heartless", "3:18", R.drawable.song_heartless, "https://open.spotify.com/track/7wcoSs40brhyS3htaaDkgD?autoplay=true", "https://music.youtube.com/watch?v=AfpUbiGHyAk&feature=gws_kp_track"),
                    Song("Faith", "4:43", R.drawable.song_faith, "https://open.spotify.com/track/3orEOtd8CPL8GFlpRpKuoE?autoplay=true", "https://music.youtube.com/watch?v=wXjNtjKXepo&feature=gws_kp_track"),
                    Song("Blinding Lights", "3:20", R.drawable.song_blinding_lights, "https://open.spotify.com/track/320T8Dnenc36SrCBbR4KOs?autoplay=true", "https://music.youtube.com/watch?v=J7p4bzqLvCw&feature=gws_kp_track"),
                    Song("In Your Eyes", "3:58", R.drawable.song_in_your_eyes, "https://open.spotify.com/track/3OIuIXUVtUeVxsXGv4ilU2?autoplay=true", "https://music.youtube.com/watch?v=klQmbfg1YSU&feature=gws_kp_track"),
                    Song("Save Your Tears", "3:36", R.drawable.song_save_your_tears, "https://open.spotify.com/track/73BQq5xdTqZal05OkBysrf?autoplay=true", "https://music.youtube.com/watch?v=QFZIpMnprpQ&feature=gws_kp_track"),
                    Song("Repeat After Me (Interlude)", "3:16", R.drawable.song_repeat_after_me_interlude, "https://open.spotify.com/track/40U8d12pC5UHqmHwXjHjjl?autoplay=true", "https://music.youtube.com/watch?v=2ZvfcF5R62c&feature=gws_kp_track"),
                    Song("After Hours", "6:01", R.drawable.song_after_hours, "https://open.spotify.com/track/3WAXILvmHFoyVHnK0kDK1S?autoplay=true", "https://music.youtube.com/watch?v=1u2fLSfAjK0&feature=gws_kp_track"),
                    Song("Until I Bleed Out", "3:10", R.drawable.song_until_i_bleed_out, "https://open.spotify.com/track/2BcnxwxBuar5wjCaLqm5N3?autoplay=true", "https://music.youtube.com/watch?v=Hb80hqz2SBs&feature=gws_kp_track")
                ),
                "56 Minutes",
                R.drawable.album_after_hours
            ),
            Album(
                "My Dear Melancholy,",
                LocalDate.of(2018, 3, 30),
                arrayListOf(
                    Song("Call Out My Name", "3:48", R.drawable.song_call_out_my_name, "https://open.spotify.com/track/1HCLJRFIChC0yk8aSTWXiC?autoplay=true", "https://music.youtube.com/watch?v=ZtEtKXhhtS4&feature=gws_kp_track"),
                    Song("Try Me", "3:41", R.drawable.song_try_me, "https://open.spotify.com/track/4ppTAJUbNXELZcoUaL90wo?autoplay=true", "https://music.youtube.com/watch?v=a4x7p76ix8M&feature=gws_kp_track"),
                    Song("Wasted Times", "3:40", R.drawable.song_wasted_times, "https://open.spotify.com/track/5H9q1VnL4TftgLYqJH5tYJ?autoplay=true", "https://music.youtube.com/watch?v=RSIoRbhnFBk&feature=gws_kp_track"),
                    Song("I Was Never There", "4:01", R.drawable.song_i_was_never_there, "https://open.spotify.com/track/3FSdXvqyomu6Lakhn7JSAO?autoplay=true", "https://music.youtube.com/watch?v=cJVpXPSXGtk&feature=gws_kp_track"),
                    Song("Hurt You", "3:50", R.drawable.song_hurt_you, "https://open.spotify.com/track/56fUbkZ2DHk2PixrNaxlzJ?autoplay=true", "https://music.youtube.com/watch?v=TZtps5Q5g08&feature=gws_kp_track"),
                    Song("Privilege", "2:51", R.drawable.song_privilege, "https://open.spotify.com/track/0Nwar8rweBUyfyuoyjjUvk?autoplay=true", "https://music.youtube.com/watch?v=iBYhYsKGmxw&feature=gws_kp_track")
                ),
                "25 Minutes",
                R.drawable.album_my_dear_melancholy
            ),
            Album(
                "Starboy",
                LocalDate.of(2016, 11, 25),
                arrayListOf(
                    Song("Starboy", "3:50", R.drawable.song_starboy, "https://open.spotify.com/track/2McYWzYTUIn8bT1kXO9bBi?autoplay=true", "https://music.youtube.com/watch?v=3_g2un5M350&feature=gws_kp_track"),
                    Song("Party Monster", "4:09", R.drawable.song_party_monster, "https://open.spotify.com/track/0GksCgk7Ux29S2arD4oNSf?autoplay=true", "https://music.youtube.com/watch?v=17c7kDMG_mU&feature=gws_kp_track"),
                    Song("Faise Alarm", "3:40", R.drawable.song_faise_alarm, "https://open.spotify.com/track/4oeaIftdpT3JuZLcCkKmVE?autoplay=true", "https://music.youtube.com/watch?v=jBhbgZYz7pI&feature=gws_kp_track"),
                    Song("Reminder", "3:39", R.drawable.song_reminder, "https://open.spotify.com/track/7vU4W2cHOF1RPHyHkCh0im?autoplay=true", "https://music.youtube.com/watch?v=a40tAP5MC6M&feature=gws_kp_track"),
                    Song("Rockin\'", "3:53", R.drawable.song_rockin, "https://open.spotify.com/track/02V0fopGouDF5GbDHftv4S?autoplay=true", "https://music.youtube.com/watch?v=BCvmAySCnLk&feature=gws_kp_track"),
                    Song("Secrets", "4:26", R.drawable.song_secrets, "https://open.spotify.com/track/3DX4Y0egvc0slLcLl31h2p?autoplay=true", "https://music.youtube.com/watch?v=2QcSvOSXTBc&feature=gws_kp_track"),
                    Song("True Colors", "3:26", R.drawable.song_true_colors, "https://open.spotify.com/track/1oGdVdYjeQvojGKDddxLQQ?autoplay=true", "https://music.youtube.com/watch?v=3Ox2AWEFhjQ&feature=gws_kp_track"),
                    Song("Stargirl Interlude", "1:52", R.drawable.song_stargirl_interlude, "https://open.spotify.com/track/4EDijkJdHBZZ0GwJ12iTAj?autoplay=true", "https://music.youtube.com/watch?v=U2TPS-9oMtc&feature=gws_kp_track"),
                    Song("Sidewalks", "3:51", R.drawable.song_sidewalks, "https://open.spotify.com/track/4h90qkbnW1Qq6pBhoPvwko?si=zu_PlTaTS0acXZxCateGwg", "https://music.youtube.com/watch?v=DWi73D1vZTc&feature=gws_kp_track"),
                    Song("Six Feet Under", "3:58", R.drawable.song_six_feet_under, "https://open.spotify.com/track/4mU5iXHeLgbR94siF7p1sY?autoplay=true", "https://music.youtube.com/watch?v=Jt5nPuMgKA8&feature=gws_kp_track"),
                    Song("Love to Lay", "3:43", R.drawable.song_love_to_lay, "https://open.spotify.com/track/27BgDmciSjoxTG0almHTpZ?autoplay=true", "https://music.youtube.com/watch?v=a1PkVEHV-w8&feature=gws_kp_track"),
                    Song("A Lonely Night", "3:40", R.drawable.song_a_lonely_night, "https://open.spotify.com/track/0ifooM33X1iBxVYyOkSbXW?autoplay=true", "https://music.youtube.com/watch?v=atGlHRi0n4A&feature=gws_kp_track"),
                    Song("Attention", "3:18", R.drawable.song_attention, "https://open.spotify.com/track/6pDVjCUA3B1vg9waKutAsv?autoplay=true", "https://music.youtube.com/watch?v=RPCqZssID78&feature=gws_kp_track"),
                    Song("Ordinary Life", "3:42", R.drawable.song_ordinary_life, "https://open.spotify.com/track/15k2nBQJ0teDmPZHrOXL2N?autoplay=true", "https://music.youtube.com/watch?v=tX2ncrjdZ3o&feature=gws_kp_track"),
                    Song("Nothing Without You", "3:19", R.drawable.song_nothing_without_you, "https://open.spotify.com/track/3Te3gG6MPEDNqLGzWrjKC3?autoplay=true", "https://music.youtube.com/watch?v=1ExndLNGnmY&feature=gws_kp_track"),
                    Song("All I Know", "5:21", R.drawable.song_all_i_know, "https://open.spotify.com/track/4MBGysmc3qsFY3jYEgYfHe?autoplay=true", "https://music.youtube.com/watch?v=sfvFAqzIGh8&feature=gws_kp_track"),
                    Song("Die for You", "4:20", R.drawable.song_die_for_you, "https://open.spotify.com/track/6jl4C5KnJ8PAbQgamwEsPG?autoplay=true", "https://music.youtube.com/watch?v=mTLQhPFx2nM&feature=gws_kp_track"),
                    Song("I Feel It Coming", "4:29", R.drawable.song_i_feel_it_coming, "https://open.spotify.com/track/3dhjNA0jGA8vHBQ1VdD6vV?autoplay=true", "https://music.youtube.com/watch?v=qPRNIHxLhmc&feature=gws_kp_track")
                ),
                "1 Hours 8 Minutes",
                R.drawable.album_starboy
            )
        ),
        // Dua Lipa Album Lists
        arrayListOf(
            Album(
                "Future Nostalgia",
                LocalDate.of(2020, 3, 27),
                arrayListOf(
                    Song("Future Nostalgia", "3:05", R.drawable.song_default, "https://open.spotify.com/track/1JGWyk1hjKNXlzJGkSP9gr?autoplay=true", "https://music.youtube.com/watch?v=0QBW3t9J4DU&feature=gws_kp_track"),
                    Song("Don\'t Start Now", "3:03", R.drawable.song_dont_star_now, "https://open.spotify.com/track/4BMvjZi540SHgx8dTJK8tE?autoplay=true", "https://music.youtube.com/watch?v=htg8v0g_4e4&feature=gws_kp_track"),
                    Song("Cool", "3:30", R.drawable.song_cool, "https://open.spotify.com/track/2nMOodYNHBAQ3Kc1QNimZU?autoplay=true", "https://music.youtube.com/watch?v=wwgVdZq_T1s&feature=gws_kp_track"),
                    Song("Physical", "3:14", R.drawable.song_default, "https://open.spotify.com/track/2iZRaQocA64isbn417hgL7?autoplay=true", "https://music.youtube.com/watch?v=UHOJR0202Ag&feature=gws_kp_track"),
                    Song("Levitating", "3:24", R.drawable.song_levitating, "https://open.spotify.com/track/0JNyKDhe89gqtfiiyJh0nN?autoplay=true", "https://music.youtube.com/watch?v=aNo5mjY1Tgc&feature=gws_kp_track"),
                    Song("Pretty Please", "3:15", R.drawable.song_default, "https://open.spotify.com/track/3Qu4U7LK6CQdTXlU15ScCu?autoplay=true", "https://music.youtube.com/watch?v=ihu6CA5Hf44&feature=gws_kp_track"),
                    Song("Hallucinate", "3:29", R.drawable.song_hallucinate, "https://open.spotify.com/track/7nNNipAgS8eSCCaYmnhG2n?autoplay=true", "https://music.youtube.com/watch?v=1LyP-wCHWcI&feature=gws_kp_track"),
                    Song("Love Again", "4:18", R.drawable.song_default, "https://open.spotify.com/track/45BZcKdKl8OXpuGSlSvEun?autoplay=true", "https://music.youtube.com/watch?v=IkL-RjXJLv0&feature=gws_kp_track"),
                    Song("Break My Heart", "3:24", R.drawable.song_break_my_heart, "https://open.spotify.com/track/1Rs8eLN30f1pjC7oxEZpCe?autoplay=true", "https://music.youtube.com/watch?v=ACZLdO4pBFI&feature=gws_kp_track"),
                    Song("Good In Bed", "3:39", R.drawable.song_default, "https://open.spotify.com/track/5idsEzxjeekla54j0jHYUE?autoplay=true", "https://music.youtube.com/watch?v=j_N4gu1weOM&feature=gws_kp_track"),
                    Song("Boys Will Be Boys", "2:46", R.drawable.song_boys_will_be_boys, "https://open.spotify.com/track/3YAINyybjItlYVhsrXWPfY?autoplay=true", "https://music.youtube.com/watch?v=JoGGMnfA4QM&feature=gws_kp_track"),
                    Song("Levitating (feat. DaBaby)", "3:23", R.drawable.song_levitating, "https://open.spotify.com/track/5nujrmhLynf4yMoMtj8AQF?si=r3ad0VknSJawab8ru4FlIw", "https://www.youtube.com/watch?v=TUVcZfQe-Kw"),
                    Song("Fever", "2:37", R.drawable.song_fever, "https://open.spotify.com/track/7KqUaHPO6m4uYg276qqsfa?autoplay=true", "https://music.youtube.com/watch?v=AiYcIlzsnMI&feature=gws_kp_track")
                ),
                "43 Minutes",
                R.drawable.album_future_nostalgia
            ),
            Album(
                "Dua Lipa",
                LocalDate.of(2017, 7, 2),
                arrayListOf(
                    Song("Genesis", "3:26", R.drawable.song_genesis, "https://open.spotify.com/track/29TpL9ws8zoA733eOXa9cm?autoplay=true", "https://music.youtube.com/watch?v=zvrAn5ZdL6Y&feature=gws_kp_track"),
                    Song("Lost In Your Light (feat. Miguel)", "3:24", R.drawable.song_lost_in_your_light, "https://open.spotify.com/track/2OWKDTonST8HNko3dBlPPp?autoplay=true", "https://music.youtube.com/watch?v=0GqdudfQlcw&feature=gws_kp_track"),
                    Song("Hotter Than Hell", "3:08", R.drawable.song_hotter_then_hell, "https://open.spotify.com/track/1z5jOmNswvnzjC5gFLu5Dv?autoplay=true", "https://music.youtube.com/watch?v=JC208IVyghQ&feature=gws_kp_track"),
                    Song("Be the One", "3:23", R.drawable.song_be_the_one, "https://open.spotify.com/track/255Nv3KNCPPAcNf20gIJh9?autoplay=true", "https://music.youtube.com/watch?v=-3gkan9wSaQ&feature=gws_kp_track"),
                    Song("IDGAF", "3:38", R.drawable.song_idgaf, "https://open.spotify.com/track/1ehCdxFHbdIm1icCCzBgpq?autoplay=true", "https://music.youtube.com/watch?v=GRRU11cFNOQ&feature=gws_kp_track"),
                    Song("Blow Your Mind (Mwah)", "2:59", R.drawable.song_blow_your_mind, "https://open.spotify.com/track/1OGazZXQ6g1h9FgCcQERBW?autoplay=true", "https://music.youtube.com/watch?v=XKnGiak6fyc&feature=gws_kp_track"),
                    Song("Garden", "3:48", R.drawable.song_garden, "https://open.spotify.com/track/1mxaufUe16G9wOoG9ptUqr?autoplay=true", "https://music.youtube.com/watch?v=PX5SIeWMJD4&feature=gws_kp_track"),
                    Song("No Goodbyes", "3:36", R.drawable.song_no_goodbyes, "https://open.spotify.com/track/4mJYcpUfpgOAhIJ3GBAg8x?autoplay=true", "https://music.youtube.com/watch?v=ZdnA9ZCM0Hk&feature=gws_kp_track"),
                    Song("Thinking \'Bout You", "2:52", R.drawable.song_thinking_bout_you, "https://open.spotify.com/track/4Wmjt3ICd1G0geHb2Loho1?autoplay=true", "https://music.youtube.com/watch?v=FYBcUuOUleI&feature=gws_kp_track"),
                    Song("New Rules", "3:29", R.drawable.song_new_rules, "https://open.spotify.com/track/2ekn2ttSfGqwhhate0LSR0?autoplay=true", "https://music.youtube.com/watch?v=ZqYGW8uXL0I&feature=gws_kp_track"),
                    Song("Begging", "3:14", R.drawable.song_begging, "https://open.spotify.com/track/4wNQAG2BzbVkLhdajjxGpR?autoplay=true", "https://music.youtube.com/watch?v=L0yOCIqqBWM&feature=gws_kp_track"),
                    Song("Homesick", "3:50", R.drawable.song_homesick, "https://open.spotify.com/track/2tnlEoEp3vdopjKieNiXVp?autoplay=true", "https://music.youtube.com/watch?v=RL_KbUyqM-8&feature=gws_kp_track"),
                    Song("Dreams", "3:40", R.drawable.song_dreams, "https://open.spotify.com/track/0EnuBzeI4oH6f0fqK9oaXI?autoplay=true", "https://music.youtube.com/watch?v=w2AJ2mgwkrg&feature=gws_kp_track"),
                    Song("Room for 2", "3:29", R.drawable.song_room_for_2, "https://open.spotify.com/track/1tQCe6mu2dT57OejEFARhy?autoplay=true", "https://music.youtube.com/watch?v=zCRYfVBB5iI&feature=gws_kp_track"),
                    Song("New Love", "4:32", R.drawable.song_new_love, "https://open.spotify.com/track/4oaTiAZOJyb5257Tbpdd75?autoplay=true", "https://music.youtube.com/watch?v=4ds2sR2Ftcc&feature=gws_kp_track"),
                    Song("Bad Together", "3:59", R.drawable.song_bad_together, "https://open.spotify.com/track/0LwbO2KIQw1uR2FCqwaKAu?autoplay=true", "https://music.youtube.com/watch?v=dC6BQD4NiVI&feature=gws_kp_track"),
                    Song("Last Dance", "3:49", R.drawable.song_last_dance, "https://open.spotify.com/track/5VgVIhrH8TblQ5QRw7ILkn?autoplay=true", "https://music.youtube.com/watch?v=hxCegisp7lM&feature=gws_kp_track")
                ),
                "1 Hours",
                R.drawable.album_dua_lipa
            )
        ),
        // Justin Bieber Album Lists
        arrayListOf(
            Album(
                "Changes",
                LocalDate.of(2020, 2, 14),
                arrayListOf(
                    Song("All Around Me", "2:17", R.drawable.song_all_around_me, "https://open.spotify.com/track/08I8yB3YbJ5c8M61bpoct3?autoplay=true", "https://music.youtube.com/watch?v=sGFcsX8S46A&feature=gws_kp_track"),
                    Song("Habitual", "2:48", R.drawable.song_habitual, "https://open.spotify.com/track/20f9nv0gOouSIHwA4DXbmA?autoplay=true", "https://music.youtube.com/watch?v=SkOUXgtBH64&feature=gws_kp_track"),
                    Song("Come Around Me", "3:21", R.drawable.song_come_around_me, "https://open.spotify.com/track/6Z6VK9LrsFf6HbnW1Try9J?autoplay=true", "https://music.youtube.com/watch?v=Eo1G7dzgvCc&feature=gws_kp_track"),
                    Song("Intentions (feat. Quavo)", "3:33", R.drawable.song_intentions, "https://open.spotify.com/track/4umIPjkehX1r7uhmGvXiSV?autoplay=true", "https://music.youtube.com/watch?v=8-c6JZKkYQw&feature=gws_kp_track"),
                    Song("Yummy", "3:29", R.drawable.song_yummy, "https://open.spotify.com/track/18190jS9db6xIkdt6HkgXj?autoplay=true", "https://music.youtube.com/watch?v=9a_CcfAQt4Q&feature=gws_kp_track"),
                    Song("Available", "3:15", R.drawable.song_available, "https://open.spotify.com/track/1b6tPXXCV2fSNtR3SKWUQA?autoplay=true", "https://music.youtube.com/watch?v=VwCTvh5dykk&feature=gws_kp_track"),
                    Song("Forever (feat. Post Malone & Clever)", "3:40", R.drawable.song_forever, "https://open.spotify.com/track/2ZlCGeK30BLRNSPC832pNZ?autoplay=true", "https://music.youtube.com/watch?v=kYaiRDshuk8&feature=gws_kp_track"),
                    Song("Running Over (feat. Lil Dicky)", "3:00", R.drawable.song_running_over, "https://open.spotify.com/track/75nKBP8jQu681pTNCtrEnn?autoplay=true", "https://music.youtube.com/watch?v=QX3IavXL8ZY&feature=gws_kp_track"),
                    Song("Take It Out On Me", "2:58", R.drawable.song_take_it_out_on_me, "https://open.spotify.com/track/39nTNk5MfyiiRupTwn1iyC?autoplay=true", "https://music.youtube.com/watch?v=8s3nEyayXRg&feature=gws_kp_track"),
                    Song("Second Emotion (feat. Travis Scott)", "3:23", R.drawable.song_second_emotion, "https://open.spotify.com/track/1PnAx788sAvcI3ZxTlEyX8?autoplay=true", "https://music.youtube.com/watch?v=Xb9bZANjev0&feature=gws_kp_track"),
                    Song("Get Me (feat. Kehlani)", "3:05", R.drawable.song_all_around_me, "https://open.spotify.com/track/5VwwpU7KsLhgfbMEecedhJ?si=ozd5ddxbSEuDQGdDp8araQ", "https://www.youtube.com/watch?v=eI_ifdDi1R4"),
                    Song("E.T.A", "2:57", R.drawable.song_eta, "https://open.spotify.com/track/6PzOPrXx8tJEqace76yrv2?autoplay=true", "https://music.youtube.com/watch?v=P4CKZO0dpJE&feature=gws_kp_track"),
                    Song("Changes", "2:15", R.drawable.song_changes, "https://open.spotify.com/track/521Os1SMlxmsoevsqyjNmJ?autoplay=true", "https://music.youtube.com/watch?v=6gp-FjUCjm8&feature=gws_kp_track"),
                    Song("Confirmation", "2:51", R.drawable.song_confirmation, "https://open.spotify.com/track/60brXKLTC15vK0av5gIldm?autoplay=true", "https://music.youtube.com/watch?v=D_s4gEk_Fbs&feature=gws_kp_track"),
                    Song("That\'s What Love Is", "2:45", R.drawable.song_thats_what_love_is, "https://open.spotify.com/track/2hLu8L8SNfCN4yKyPdX0h3?autoplay=true", "https://music.youtube.com/watch?v=3hExj4GSnqg&feature=gws_kp_track"),
                    Song("At Least For Now", "2:30", R.drawable.song_at_least_for_now, "https://open.spotify.com/track/6VLkgf5YmLixsabdqiCVGU?autoplay=true", "https://music.youtube.com/watch?v=s4VObu0_bEY&feature=gws_kp_track"),
                    Song("Yummy - Summer Walker Remix", "3:29", R.drawable.song_yummy, "https://open.spotify.com/track/18190jS9db6xIkdt6HkgXj?autoplay=true", "https://music.youtube.com/watch?v=9a_CcfAQt4Q&feature=gws_kp_track")
                ),
                "51 Minutes",
                R.drawable.album_changes
            ),
            Album(
                "Purpose",
                LocalDate.of(2015, 11, 13),
                arrayListOf(
                    Song("Mark My Words", "2:14", R.drawable.song_mark_my_words, "https://open.spotify.com/track/1iT8XvxyI4UQqAiPqSx9lP?autoplay=true", "https://music.youtube.com/watch?v=kg8NxZZ4gtQ&feature=gws_kp_track"),
                    Song("I\'ll Show You", "3:20", R.drawable.song_i_ll_show_you, "https://open.spotify.com/track/4fCb5jFEafjP6UfC0EfCxY?autoplay=true", "https://music.youtube.com/watch?v=GFaduP_AHqc&feature=gws_kp_track"),
                    Song("What Do You Mean?", "3:26", R.drawable.song_what_do_you_mean, "https://open.spotify.com/track/5opiZl6mOioamgZSGNIL1V?autoplay=true", "https://music.youtube.com/watch?v=TwNBjK2UIq0&feature=gws_kp_track"),
                    Song("Sorry", "3:21", R.drawable.song_sorry, "https://open.spotify.com/track/69bp2EbF7Q2rqc5N3ylezZ?autoplay=true", "https://music.youtube.com/watch?v=ZB1h3LdLw7E&feature=gws_kp_track"),
                    Song("Love Yourself", "3:54", R.drawable.song_love_yourself, "https://open.spotify.com/track/4Z3DARCZslip7QVG60ZQCn?autoplay=true", "https://music.youtube.com/watch?v=ecP67amslBU&feature=gws_kp_track"),
                    Song("Company", "3:28", R.drawable.song_company, "https://open.spotify.com/track/61uyGDPJ06MkxJtHgPmuyO?autoplay=true", "https://music.youtube.com/watch?v=-mjaJoa1RP0&feature=gws_kp_track"),
                    Song("No Pressure", "4:47", R.drawable.song_no_pressure, "https://open.spotify.com/track/23UV8pJEvRnAZd6ZAXBC0H?autoplay=true", "https://music.youtube.com/watch?v=Gr0fY1IjD90&feature=gws_kp_track"),
                    Song("No Sense", "4:35", R.drawable.song_no_sense, "https://open.spotify.com/track/5L9WFUodzACitS1TiGm7Mi?autoplay=true", "https://music.youtube.com/watch?v=xhr5yIkJCNs&feature=gws_kp_track"),
                    Song("The Feeling", "4:05", R.drawable.song_the_feeling, "https://open.spotify.com/track/1gJt0OFStLJUwrD4rmouIR?autoplay=true", "https://music.youtube.com/watch?v=6f83S7wPk8g&feature=gws_kp_track"),
                    Song("Life Is Worth Living", "3:55", R.drawable.song_life_is_worth_living, "https://open.spotify.com/track/4yWCzA44dQyp0SoeM81bUb?autoplay=true", "https://music.youtube.com/watch?v=w6Iu3DJjVW0&feature=gws_kp_track"),
                    Song("Where Are U Now", "4:03", R.drawable.song_where_are_you_now, "https://open.spotify.com/track/0eRZEqoEKb8ToK8R1x7kcf?autoplay=true", "https://music.youtube.com/watch?v=izzXil297rk&feature=gws_kp_track"),
                    Song("Children", "3:43", R.drawable.song_children, "https://open.spotify.com/track/499EhTKHSo3Kiwvx0scSUr?autoplay=true", "https://music.youtube.com/watch?v=WCZrf-lAoFo&feature=gws_kp_track"),
                    Song("Purpose", "3:30", R.drawable.song_purpose, "https://open.spotify.com/track/2k85EQLEMyZKX8X7MhKsrq?autoplay=true", "https://music.youtube.com/watch?v=McSsBUd_oN0&feature=gws_kp_track"),
                    Song("Been You", "3:19", R.drawable.song_been_you, "https://open.spotify.com/track/66xrTPRDRsIq9Sd0awekKl?autoplay=true", "https://music.youtube.com/watch?v=v1a2A_77hUQ&feature=gws_kp_track"),
                    Song("Get Used To It", "3:58", R.drawable.song_get_used_it, "https://open.spotify.com/track/4AMnUGvZUVJgDuY7rOPzUZ?autoplay=true", "https://music.youtube.com/watch?v=2mF7vD1D0XU&feature=gws_kp_track"),
                    Song("We Are", "3:23", R.drawable.song_we_are, "https://open.spotify.com/track/1m6FkAtWVloxIRHKl7pBDP?autoplay=true", "https://music.youtube.com/watch?v=HSXmJo7V3U4&feature=gws_kp_track"),
                    Song("Trust", "3:24", R.drawable.song_trust, "https://open.spotify.com/track/00IH8ZjI9ZGB51WRX1Oesj?autoplay=true", "https://music.youtube.com/watch?v=riE7iELLun0&feature=gws_kp_track"),
                    Song("All In It", "3:51", R.drawable.song_all_in_it, "https://open.spotify.com/track/4kP50JQmyFrl9pLSmnFPZr?autoplay=true", "https://music.youtube.com/watch?v=Dmuxn3TG68c&feature=gws_kp_track")
                ),
                "1 Hours 9 Minutes",
                R.drawable.album_purpose
            )
        ),
        // Ariana Grande Album Lists
        arrayListOf(
            Album(
                "Positions",
                LocalDate.of(2020, 10, 30),
                arrayListOf(
                    Song("Shut Up", "2:38", R.drawable.song_positions, "https://open.spotify.com/track/0QQSR0relCdVhTMpfhWHNZ?autoplay=true", "https://music.youtube.com/watch?v=liQRdzAYk1M&feature=gws_kp_track"),
                    Song("34+35", "2:54", R.drawable.song_positions, "https://open.spotify.com/track/6Im9k8u9iIzKMrmV7BWtlF?autoplay=true", "https://music.youtube.com/watch?v=FKQBr0iMUHw&feature=gws_kp_track"),
                    Song("Motive (with Doja Cat)", "2:48", R.drawable.song_positions, "https://open.spotify.com/track/0zB7iPxmJNRVfc4pWDlnq0?autoplay=true", "https://music.youtube.com/watch?v=6Q9JSgxYLm0&feature=gws_kp_track"),
                    Song("Just Like Magic", "2:30", R.drawable.song_positions, "https://open.spotify.com/track/1N9hFgcgWYbGINUKjhvcK6?si=g5vIo3p6QBKr5qR-1AQ0DQ", "https://music.youtube.com/watch?v=tOKnxqk_bRQ&feature=gws_kp_track"),
                    Song("Off The Table (with The Weeknd)", "4:00", R.drawable.song_positions, "https://open.spotify.com/track/1qKdid2S9fZdSrzLaCcjcF?si=qBvNMX-AR82S0wbskbKEbw", "https://music.youtube.com/watch?v=O249rUwODHo&feature=gws_kp_track"),
                    Song("Six Thirty", "3:04", R.drawable.song_positions, "https://open.spotify.com/track/4rJWTThj9EWR6UqD1eVyge?si=I7-mgYdoTx-F0dUCQghq5w", "https://music.youtube.com/watch?v=B5gIMh6oByY&feature=gws_kp_track"),
                    Song("Safety Net (feat. Ty Dolla \$ign)", "3:28", R.drawable.song_positions, "https://open.spotify.com/track/53Z8fbdVNus9Kiu7tWIBEC?si=0kS-UvfZTh2rqYKCd09CbA", "https://music.youtube.com/watch?v=2T8nQZkWWUk&feature=gws_kp_track"),
                    Song("My Hair", "2:38", R.drawable.song_positions, "https://open.spotify.com/track/5Ds3yH73nMHgkmJxcxqPrr?si=dsFYlZ8NRFq413KOmKAdKg", "https://music.youtube.com/watch?v=yEO9vPzgRc0&feature=gws_kp_track"),
                    Song("Nasty", "3:21", R.drawable.song_positions, "https://open.spotify.com/track/7wcl0YJBQ0ygTUUaXLRM1g?si=KBdtZXW_SUqXAZURAZCHLA", "https://music.youtube.com/watch?v=XD4lu-NXctw&feature=gws_kp_track"),
                    Song("West Side", "2:12", R.drawable.song_positions, "https://open.spotify.com/track/7cFYqReKEigTxTm0bNE6YA?si=hVGAKMmkSiKJyfMfWvn1Qw", "https://music.youtube.com/watch?v=PxGLsAOqg5A&feature=gws_kp_track"),
                    Song("Love Language", "3:00", R.drawable.song_positions, "https://open.spotify.com/track/3HwtjYXnBkhsD2gBwyiIHR?autoplay=true", "https://music.youtube.com/watch?v=A6a35LdbyaY&feature=gws_kp_track"),
                    Song("Positions", "2:52", R.drawable.song_positions, "https://open.spotify.com/track/35mvY5S1H3J2QZyna3TFe0?autoplay=true", "https://music.youtube.com/watch?v=xuOOAQoDKN0&feature=gws_kp_track"),
                    Song("Obvious", "2:27", R.drawable.song_positions, "https://open.spotify.com/track/65OEcDb4M3mAvEpSdXi6Lv?si=mQf5Ct-7ToKmHI_PxAVZyw", "https://music.youtube.com/watch?v=5XHvDklHQFo&feature=gws_kp_track"),
                    Song("POV", "3:22", R.drawable.song_positions, "https://open.spotify.com/track/3RP1eXaK8f4rwqY9fRKVRF?si=d48N8KhGQEOiQMojdLyRjA", ""),
                    Song("Someone Like U - Interlude", "1:17", R.drawable.song_positions, "https://open.spotify.com/track/1bj8x3ERN9gSc2NfJIpc76?autoplay=true", "https://music.youtube.com/watch?v=QyF4aAQPw6c&feature=gws_kp_track")
                ),
                "51 Minutes",
                R.drawable.album_positions
            ),
            Album(
                "thank u, next",
                LocalDate.of(2019, 2, 8),
                arrayListOf(
                    Song("imagine", "3:32", R.drawable.song_imagine, "https://open.spotify.com/track/39LmTF9RgyakzSYX8txrow?autoplay=true", "https://music.youtube.com/watch?v=ZSFHOIuUl7E&feature=gws_kp_track"),
                    Song("needy", "2:52", R.drawable.song_needy, "https://open.spotify.com/track/1TEL6MlSSVLSdhOSddidlJ?autoplay=true", "https://music.youtube.com/watch?v=bGY7Vae7pwc&feature=gws_kp_track"),
                    Song("NASA", "3:02", R.drawable.song_nasa, "https://open.spotify.com/track/4uTvPEr01pjTbZgl7jcKBD?autoplay=true", "https://music.youtube.com/watch?v=6Pd1ODrVazw&feature=gws_kp_track"),
                    Song("bloodline", "3:37", R.drawable.song_bloodline, "https://open.spotify.com/track/2hloaUoRonYssMuqLCBLTX?autoplay=true", "https://music.youtube.com/watch?v=4b_ugh-65NQ&feature=gws_kp_track"),
                    Song("fake smile", "3:29", R.drawable.song_fake_smile, "https://open.spotify.com/track/3wFLWP0FcIqHK1wb1CPthQ?autoplay=true", "https://music.youtube.com/watch?v=uOUuFLhbgRk&feature=gws_kp_track"),
                    Song("bad idea", "4:27", R.drawable.song_bad_idea, "https://open.spotify.com/track/5Il6Oe7lr5XM7A0cWbVQtr?autoplay=true", "https://music.youtube.com/watch?v=UjIzzi4WILI&feature=gws_kp_track"),
                    Song("make up", "2:21", R.drawable.song_make_up, "https://open.spotify.com/track/1TCEZgYrPjc2G5sBYJciuq?autoplay=true", "https://music.youtube.com/watch?v=HSFRQgrgxXE&feature=gws_kp_track"),
                    Song("ghostin", "4:31", R.drawable.song_ghostin, "https://open.spotify.com/track/2vdBo4ALPYbHRUPKgtE5iC?autoplay=true", "https://music.youtube.com/watch?v=Qztc5UGupj4&feature=gws_kp_track"),
                    Song("in my head", "3:43", R.drawable.song_in_my_head, "https://open.spotify.com/track/2QIcCx7MV914oIL2JmBoBV?autoplay=true", "https://music.youtube.com/watch?v=R5hPUMUlNaE&feature=gws_kp_track"),
                    Song("7 rings", "2:59", R.drawable.song_7_rings, "https://open.spotify.com/track/6ocbgoVGwYJhOv1GgI9NsF?autoplay=true", "https://music.youtube.com/watch?v=XZ868t23Pb4&feature=gws_kp_track"),
                    Song("thank u, next", "3:27", R.drawable.song_thanku_next, "https://open.spotify.com/track/3e9HZxeyfWwjeyPAMmWSSQ?autoplay=true", "https://music.youtube.com/watch?v=GftZ601-pXs&feature=gws_kp_track"),
                    Song("break up with your girlfriend, i\'m bored", "3:10", R.drawable.song_break_up_with_your_girlfriend, "https://open.spotify.com/track/56feSEETtLwNjY5Xz8XbKI?autoplay=true", "https://music.youtube.com/watch?v=4nbYqWVXp7Q&feature=gws_kp_track"),
                ),
                "41 Minutes",
                R.drawable.album_thank_u_next
            )
        ),
        // Ed Sheeran Album Lists
        arrayListOf(
            Album(
                "No. 6 Collaboration Project",
                LocalDate.of(2019, 7, 12),
                arrayListOf(
                    Song("Beautiful People (feat. Khalid)", "3:18", R.drawable.song_beautiful_people, "https://open.spotify.com/track/70eFcWOvlMObDhURTqT4Fv?autoplay=true", "https://music.youtube.com/watch?v=6v8BmMirkUk&feature=gws_kp_track"),
                    Song("South of The Border (feat. Camila Cabello & Cardi B)", "3:24", R.drawable.song_south_of_the_border, "https://open.spotify.com/track/71BgDMZ6FbL5AKcERaxJ6n?autoplay=true", "https://music.youtube.com/watch?v=JFOQjm7BfRE&feature=gws_kp_track"),
                    Song("Cross Me (feat. Chance the Rapper & PnB Rock)", "3:26", R.drawable.song_cross_me, "https://open.spotify.com/track/1oH5Mg9dyAj15lWUmXvmFW?autoplay=true", "https://music.youtube.com/watch?v=_ZKkYeyb778&feature=gws_kp_track"),
                    Song("Take Me Back to London (feat. Stormzy)", "3:10", R.drawable.song_take_me_back_to_london, "https://open.spotify.com/track/1AI7UPw3fgwAFkvAlZWhE0?autoplay=true", "https://music.youtube.com/watch?v=fuCJsoXvcS8&feature=gws_kp_track"),
                    Song("Best Part of Me (feat. YEBBA)", "4:03", R.drawable.song_best_part_of_me, "https://open.spotify.com/track/5ug4vqGZ3eisGhY1IsziNX?autoplay=true", "https://music.youtube.com/watch?v=4CskSETO0-w&feature=gws_kp_track"),
                    Song("I Dont Care (with Justin Bieber)", "3:40", R.drawable.song_i_dont_want_your_money, "https://open.spotify.com/track/0hVXuCcriWRGvwMV1r5Yn9?si=5jAe198ZSXC4FyL9yc6saA", "https://music.youtube.com/watch?v=7hDam9i-Aps&feature=gws_kp_track"),
                    Song("Antisocial (with Travis Scout)", "2:42", R.drawable.song_antisocial, "https://open.spotify.com/track/1DhRbox3xkceP64k3JeYfW?autoplay=true", "https://music.youtube.com/watch?v=HTAGWZXM99k&feature=gws_kp_track"),
                    Song("Remember The Name (feat. Eminem & 50 Cent)", "3:28", R.drawable.song_remember_the_name, "https://open.spotify.com/track/0AtP8EkGPn6SwxKDaUuXec?autoplay=true", "https://music.youtube.com/watch?v=YApxUdL4gLI&feature=gws_kp_track"),
                    Song("Feels (feat. Young Thug & J Hus)", "2:31", R.drawable.song_feels, "https://open.spotify.com/track/4qhw4uLzaW0TjgGvTxJ2Pu?autoplay=true", "https://music.youtube.com/watch?v=LL32Ov-uh2k&feature=gws_kp_track"),
                    Song("Put It All on Me (feat. Ella Mai)", "3:17", R.drawable.song_put_it_all_on_me, "https://open.spotify.com/track/2neYa7NyqIuPR67tehREKZ?autoplay=true", "https://music.youtube.com/watch?v=bvi-WHk7lbo&feature=gws_kp_track"),
                    Song("Nothing On You (feat. Paulo Londra & Dave)", "3:21", R.drawable.song_nothing_on_you, "https://open.spotify.com/track/2qRN7PWiHRLprw4FpDeI9N?autoplay=true", "https://music.youtube.com/watch?v=9V0umbsMe28&feature=gws_kp_track"),
                    Song("I Dont Want Your Money (feat. H.E.R)", "3:25", R.drawable.song_i_dont_want_your_money, "https://open.spotify.com/track/3FHXUqaUer9o231Je1zxIN?autoplay=true", "https://music.youtube.com/watch?v=wZ61wYcCS9U&feature=gws_kp_track"),
                    Song("1000 Nights (feat. Meek Mill & A Boogie Wit da Hoodie)", "3:32", R.drawable.song_1000_nights, "https://open.spotify.com/track/4vIKzWqtn44umal5jXq4wE?autoplay=true", "https://music.youtube.com/watch?v=JgPoLra64SA&feature=gws_kp_track"),
                    Song("Way To Break My Heart (feat. Skrillex)", "3:10", R.drawable.song_way_to_break_my_heart, "https://open.spotify.com/track/5d1rmWWF1725tnYjq6rMDB?autoplay=true", "https://music.youtube.com/watch?v=p-6aRjVrAPo&feature=gws_kp_track"),
                    Song("BLOW (with Chris Stapleton & Bruno Mars)", "3:29", R.drawable.song_blow, "https://open.spotify.com/track/6EbduYTr62sSzvl36wWiFM?autoplay=true", "https://music.youtube.com/watch?v=LW4t5exa-aE&feature=gws_kp_track")
                ),
                "49 Minutes",
                R.drawable.album_no_6_collaboration
            ),
            Album(
                "÷",
                LocalDate.of(2017, 3, 3),
                arrayListOf(
                    Song("Eraser", "3:47", R.drawable.song_eraser, "https://open.spotify.com/track/7oolFzHipTMg2nL7shhdz2?si=E9HuhCRpQL-Hvtrz8xN8tw", "https://music.youtube.com/watch?v=Xr5n32SkzGQ&feature=gws_kp_track"),
                    Song("Castle on the Hill", "4:21", R.drawable.song_castle_on_the_hill, "https://open.spotify.com/track/6PCUP3dWmTjcTtXY02oFdT?si=7D8UEt6GT4SoZmNdHKgqWg", "https://music.youtube.com/watch?v=wqlTrBCNRiY&feature=gws_kp_track"),
                    Song("Dive", "3:58", R.drawable.song_dive, "https://open.spotify.com/track/51ChrwmUPDJvedPQnIU8Ls?autoplay=true", "https://music.youtube.com/watch?v=zg95do1LTdk&feature=gws_kp_track"),
                    Song("Shape of You", "3:54", R.drawable.song_shape_of_you, "https://open.spotify.com/track/7qiZfU4dY1lWllzX7mPBI3?si=iKvGrbjdRYa1EFfzF9SjTQ", "https://music.youtube.com/watch?v=xTvyyoF_LZY&feature=gws_kp_track"),
                    Song("Perfect", "4:23", R.drawable.song_perfect, "https://open.spotify.com/track/0tgVpDi06FyKpA1z0VMD4v?si=_-GY5tg7RduL4weW3RzMXQ", "https://music.youtube.com/watch?v=ORrFJ63nlcA&feature=gws_kp_track"),
                    Song("Galway Girl", "2:51", R.drawable.song_galway_girl, "https://open.spotify.com/track/0afhq8XCExXpqazXczTSve?si=Bnr7bmotRPKlY3aQRCeV8g", "https://www.youtube.com/watch?v=87gWaABqGYs"),
                    Song("Happier", "3:28", R.drawable.song_happier, "https://open.spotify.com/track/2RttW7RAu5nOAfq6YFvApB?autoplay=true", "https://www.youtube.com/watch?v=iWZmdoY1aTE"),
                    Song("New Man", "3:09", R.drawable.song_new_man, "https://open.spotify.com/track/5HDPtsnyb3maFmPL8LLUTG?autoplay=true", "https://music.youtube.com/watch?v=nS9J4tuEeT8&feature=gws_kp_track"),
                    Song("Hearts Dont Break Around Here", "4:08", R.drawable.song_heart_dont_break_around_here, "https://open.spotify.com/track/2dfHh7ECGxfNqZTQno09Vk?si=6sKi1rhUTUOb8Teh8lWKKw", "https://music.youtube.com/watch?v=ugHePw5EaGY&feature=gws_kp_track"),
                    Song("What Do I Know?", "3:57", R.drawable.song_what_do_i_know, "https://open.spotify.com/track/2pJZ1v8HezrAoZ0Fhzby92?autoplay=true", "https://music.youtube.com/watch?v=VDc9zSpu4Es&feature=gws_kp_track"),
                    Song("How Would You Feel (Paean)", "4:41", R.drawable.song_how_would_you_feel, "https://open.spotify.com/track/1lyNFzcCl9kXCof6GV32fV?autoplay=true", "https://music.youtube.com/watch?v=g6cMw396dyM&feature=gws_kp_track"),
                    Song("Supermarket Flowers", "3:41", R.drawable.song_supermarket_flowers, "https://open.spotify.com/track/4VuS959DSpr82t3qBqCrWG?autoplay=true", "https://music.youtube.com/watch?v=CxSK2x5pPhk&feature=gws_kp_track"),
                    Song("Barcelona", "3:11", R.drawable.song_barcelona, "https://open.spotify.com/track/3Lfiu5sZ4M4B6JaKMBc0FU?autoplay=true", "https://music.youtube.com/watch?v=RCu_OEquSEk&feature=gws_kp_track"),
                    Song("Bibia Be Ye Ye", "2:57", R.drawable.song_bibia_be_ye_ye, "https://open.spotify.com/track/6SznMYPQJHzr3IwsAHLId2?autoplay=true", "https://music.youtube.com/watch?v=5WzlyByDMqY&feature=gws_kp_track"),
                    Song("Nancy Mulligan", "3:00", R.drawable.song_nancy_mulligan, "https://open.spotify.com/track/35QZaWQRkmnAVqBF1TLCxQ?autoplay=true", "https://music.youtube.com/watch?v=HkuHJRhRZjM&feature=gws_kp_track"),
                    Song("Save Myself", "4:07", R.drawable.song_save_myself, "https://open.spotify.com/track/6TIU9Ehmi6dMzZK73Ym4yj?autoplay=true", "https://music.youtube.com/watch?v=6iGtfjosOu0&feature=gws_kp_track")
                ),
                "59 Minutes",
                R.drawable.album_divide
            )
        ),
        // J Balvin Album Lists
        arrayListOf(
            Album(
                "Colores",
                LocalDate.of(2020, 3, 19),
                arrayListOf(
                    Song("Amarillo", "2:38", R.drawable.song_amarillo, "https://open.spotify.com/track/4Dta3lgX5WOdEUBQZUDOME?autoplay=true", "https://music.youtube.com/watch?v=29G492EolLI&feature=gws_kp_track"),
                    Song("Azul", "3:26", R.drawable.song_azul, "https://open.spotify.com/track/4B59d7BodkV8g3XHSFNqJl?autoplay=true", "https://music.youtube.com/watch?v=_XTu5vefx5Y&feature=gws_kp_track"),
                    Song("Rojo", "2:31", R.drawable.song_rojo, "https://open.spotify.com/track/380HmhwTE2NJgawn1NwkXi?autoplay=true", "https://music.youtube.com/watch?v=NcxiMJdJ47s&feature=gws_kp_track"),
                    Song("Rosa", "3:10", R.drawable.song_rosa, "https://open.spotify.com/track/2nAxJpx95XzMwobadfwKrA?autoplay=true", "https://music.youtube.com/watch?v=cBZxYJW0zQE&feature=gws_kp_track"),
                    Song("Morado", "3:20", R.drawable.song_morado, "https://open.spotify.com/track/7cG0BIHh5OPRWau3T0XQiR?autoplay=true", "https://music.youtube.com/watch?v=d6fczQ-M_dE&feature=gws_kp_track"),
                    Song("Verde", "2:23", R.drawable.song_rosa, "https://open.spotify.com/track/3HTbI3yUJQw3fP0Po8qLcD?si=clhNNP0BR3GhNyW5c6y3vg", "https://music.youtube.com/watch?v=KpJDDidQMIQ&feature=gws_kp_track"),
                    Song("Negro", "3:02", R.drawable.song_negro, "https://open.spotify.com/track/151QnNaK29cIjB46CTXZPi?autoplay=true", "https://music.youtube.com/watch?v=AxxYk6yae2o&feature=gws_kp_track"),
                    Song("Gris", "2:57", R.drawable.song_gris, "https://open.spotify.com/track/6A4mjlbB3yEililHnZ2g3E?autoplay=true", "https://music.youtube.com/watch?v=5XkHKg2Vr0M&feature=gws_kp_track"),
                    Song("Arcoiris", "3:07", R.drawable.song_arcoins, "https://open.spotify.com/track/0hsNFOIHVJwc0NdjBm0Aec?autoplay=true", "https://music.youtube.com/watch?v=toRGDbdquW8&feature=gws_kp_track"),
                    Song("Blanco", "2:26", R.drawable.song_blanco, "https://open.spotify.com/track/7jbgExbA7XemqghFmyO4ec?autoplay=true", "https://music.youtube.com/watch?v=3tPyuorcWOo&feature=gws_kp_track")
                ),
                "28 Minutes",
                R.drawable.album_colores
            ),
            Album(
                "Oasis",
                LocalDate.of(2019, 6, 28),
                arrayListOf(
                    Song("MOJAITA", "3:07", R.drawable.song_mojaita, "https://open.spotify.com/track/71pEiUWwfDFiRO6RmFpnBf?autoplay=true", "https://music.youtube.com/watch?v=TFHzKWPDnLQ&feature=gws_kp_track"),
                    Song("YO LE LLEGO", "4:10", R.drawable.song_yo_le_llego, "https://open.spotify.com/track/3CYb1MKK6ZVoJTB2tJGQiI?autoplay=true", "https://music.youtube.com/watch?v=Zrst3KPEex4&feature=gws_kp_track"),
                    Song("CUIDAO POR AHI", "3:18", R.drawable.song_cuidao_por_ahi, "https://open.spotify.com/track/7uFlo7urAm1BsZErNzKeT7?autoplay=true", "https://music.youtube.com/watch?v=pbE7j_lvbTo&feature=gws_kp_track"),
                    Song("QUE PRETENDES", "3:42", R.drawable.song_que_pretendes, "https://open.spotify.com/track/528zOLWQIdMJTkZEkbvPeR?autoplay=true", "https://music.youtube.com/watch?v=1GkWwTzzcvU&feature=gws_kp_track"),
                    Song("LA CANCION", "4:03", R.drawable.song_la_cancion, "https://open.spotify.com/track/2P2kJEIAXutA2J7DXW1Wux?autoplay=true", "https://music.youtube.com/watch?v=WsGnCt-gT44&feature=gws_kp_track"),
                    Song("UN PESO", "4:37", R.drawable.song_mojaita, "https://open.spotify.com/track/5oEtHOK4n5HXQnnKU7BezA?autoplay=true", "https://music.youtube.com/watch?v=ocFRMA8Vicw&feature=gws_kp_track"),
                    Song("ODIO", "4:30", R.drawable.song_odio, "https://open.spotify.com/track/7alOsNr36sJ8CyOEP4aILq?autoplay=true", "https://music.youtube.com/watch?v=pHDKIEiB21Y&feature=gws_kp_track"),
                    Song("COMO UN BEBE", "3:39", R.drawable.song_como_un_bebe, "https://open.spotify.com/track/0RgqhguZnp7zlDf9s2Gjgr?autoplay=true", "https://music.youtube.com/watch?v=IZQAzOuvCs0&feature=gws_kp_track"),
                ),
                "31 Minutes",
                R.drawable.album_oasis
            )
        ),
        // Drake Album Lists
        arrayListOf(
            Album(
                "Dark Lane Demo Tapes",
                LocalDate.of(2020, 5, 1),
                arrayListOf(
                    Song("Deep Pockets", "3:43", R.drawable.song_deep_pockets, "https://open.spotify.com/track/3IvMYBE7A3c7to1aEcfFJk?autoplay=true", "https://music.youtube.com/watch?v=O7GixixEk-g&feature=gws_kp_track"),
                    Song("When To Say When", "3:43", R.drawable.song_when_to_say_when, "https://open.spotify.com/track/5TCBWmEBrin7etRa4Lswr1?autoplay=true", "https://music.youtube.com/watch?v=JsW-u1B_ecI&feature=gws_kp_track"),
                    Song("Chicago Freestyle (feat. Giveon)", "3:40", R.drawable.song_chicago_freestyle, "https://open.spotify.com/track/75VJBp3JE7W3oKoFeq1esH?autoplay=true", "https://music.youtube.com/watch?v=ZzuXhUZUDyc&feature=gws_kp_track"),
                    Song("Not You Too (feat. Chris Brown)", "4:30", R.drawable.song_not_you_too, "https://open.spotify.com/track/3Q4gttWQ6hxqWOa3tHoTNi?autoplay=true", "https://music.youtube.com/watch?v=12NrPQ9cxyg&feature=gws_kp_track"),
                    Song("Toosie Slide", "4:07", R.drawable.song_toosie_slide, "https://open.spotify.com/track/127QTOFJsJQp5LbJbu3A1y?autoplay=true", "https://music.youtube.com/watch?v=eqMj9DTQcAQ&feature=gws_kp_track"),
                    Song("Desires (with Future)", "3:58", R.drawable.song_desires, "https://open.spotify.com/track/5wWzslCFGlDuhJ4oKgS8bc?autoplay=true", "https://music.youtube.com/watch?v=YhX4nCjsIVo&feature=gws_kp_track"),
                    Song("Time Flies", "3:13", R.drawable.song_time_flies, "https://open.spotify.com/track/5H4mXWKcicuLKDn4Jy0sK7?autoplay=true", "https://music.youtube.com/watch?v=8OSuiz8TeNc&feature=gws_kp_track"),
                    Song("Landed", "2:32", R.drawable.song_landed, "https://open.spotify.com/track/3KixNgUEaDtrKJVzdqjU5q?autoplay=true", "https://music.youtube.com/watch?v=_BoYhuDyi7o&feature=gws_kp_track"),
                    Song("D4L", "3:09", R.drawable.song_deep_pockets, "https://open.spotify.com/track/5fHrHoJKfCgBd35zwIBmUK?si=T1qMZCLZQIalrREwZ0MVdQ", "https://music.youtube.com/watch?v=7c2dFpkgWvY&feature=gws_kp_track"),
                    Song("Pain 1993 (with Playboi Carti)", "2:29", R.drawable.song_pain_1993, "https://open.spotify.com/track/3h4DgeqD7d2Pu8QF0j7NEH?autoplay=true", "https://music.youtube.com/watch?v=k0m4DYO4KM4&feature=gws_kp_track"),
                    Song("Losses", "4:31", R.drawable.song_losses, "https://open.spotify.com/track/6fLVTVaHWaEfVKfEgbkf4D?autoplay=true", "https://music.youtube.com/watch?v=JR-WupKgOUA&feature=gws_kp_track"),
                    Song("From Florida With Love", "3:55", R.drawable.song_from_florida_with_love, "https://open.spotify.com/track/7FlgWcLOubhQXsSUChLMPL?autoplay=true", "https://music.youtube.com/watch?v=ij2xBNogk2Q&feature=gws_kp_track"),
                    Song("Demons (feat. Fivio Foreign & Sosa Geek)", "3:52", R.drawable.song_demons, "https://open.spotify.com/track/05aZ9sAU1YXndHv0FMi9iW?autoplay=true", "https://music.youtube.com/watch?v=2BH30d3rcs0&feature=gws_kp_track"),
                    Song("War", "3:00", R.drawable.song_deep_pockets, "https://open.spotify.com/track/51g4mohrWYmBO7s2V2OVWY?autoplay=true", "https://music.youtube.com/watch?v=JgMKDpdJ-4E&feature=gws_kp_track")
                ),
                "49 Minutes",
                R.drawable.album_dark_lane_demo_tapes
            ),
            Album(
                "What A Time To Be Alive",
                LocalDate.of(2015, 9, 20),
                arrayListOf(
                    Song("Digital Dash", "3:51", R.drawable.song_what_a_time_to_be_alive, "https://open.spotify.com/track/0v0QJqLvo3tnqwYLdLqdza?autoplay=true", "https://www.youtube.com/watch?v=PCO84KP6uvg"),
                    Song("Big Rings", "3:38", R.drawable.song_what_a_time_to_be_alive, "https://open.spotify.com/track/7jslhIiELQkgW9IHeYNOWE?autoplay=true", "https://www.youtube.com/watch?v=PL8phfwG3H8"),
                    Song("Live from The Gutter", "3:32", R.drawable.song_what_a_time_to_be_alive, "https://open.spotify.com/track/2uTG00P1DkhB97pdITkl2O?autoplay=true", "https://www.youtube.com/watch?v=hrX0zrxvBdo"),
                    Song("Diamonds Dancing", "5:15", R.drawable.song_what_a_time_to_be_alive, "https://open.spotify.com/track/2AGottAzfC8bHzF7kEJ3Wa?autoplay=true", "https://www.youtube.com/watch?v=6b-HQxZnNx8"),
                    Song("Scholarships", "3:29", R.drawable.song_what_a_time_to_be_alive, "https://open.spotify.com/track/6DGV9o1qFcx18O6uRIeCBM?autoplay=true", "https://www.youtube.com/watch?v=CMqaAssbMCA"),
                    Song("Plastic Bag", "3:22", R.drawable.song_what_a_time_to_be_alive, "https://open.spotify.com/track/3MTZYvIcZXwmc8tFrAr9bA?autoplay=true", "https://www.youtube.com/watch?v=SX3Tnah4rtY"),
                    Song("I\'m The Plug", "3:00", R.drawable.song_what_a_time_to_be_alive, "https://open.spotify.com/track/67KJIWrUpIG3ONOpZpvVbR?autoplay=true", "https://www.youtube.com/watch?v=sJolcShzn0E"),
                    Song("Change Locations", "3:41", R.drawable.song_what_a_time_to_be_alive, "https://open.spotify.com/track/1CEPBDQk2rU9bIBwcsXkOM?autoplay=true", "https://www.youtube.com/watch?v=Ty-YwPXXEik"),
                    Song("Jumpman", "3:26", R.drawable.song_what_a_time_to_be_alive, "https://open.spotify.com/track/27GmP9AWRs744SzKcpJsTZ?autoplay=true", "https://www.youtube.com/watch?v=NjY3arJMgls"),
                    Song("Jersey", "3:09", R.drawable.song_what_a_time_to_be_alive, "https://open.spotify.com/track/2ACys0pX0SjmpQmQWzp7wt?autoplay=true", "https://music.youtube.com/watch?v=cJzz0zz7JeU&feature=gws_kp_track"),
                    Song("30 for 30 Freestyle", "4:14", R.drawable.song_what_a_time_to_be_alive, "https://open.spotify.com/track/1svrFSGhPdKaFFinZSoltt?autoplay=true", "https://www.youtube.com/watch?v=Voa7FDezcTw"),
                ),
                "40 Minutes",
                R.drawable.album_what_a_time_to_be_alive
            )
        ),
        // Billie Eilish Album Lists
        arrayListOf(
            Album(
                "When We All Fall Asleep, Where Do We Go?",
                LocalDate.of(2019, 3, 29),
                arrayListOf(
                    Song("bad guy", "3:14", R.drawable.song_bad_guy, "https://open.spotify.com/track/5TAr9GfcQXXl6cwFfzvA6I?autoplay=true", "https://music.youtube.com/watch?v=mAj1kgPdlg4&feature=gws_kp_track"),
                    Song("xanny", "4:04", R.drawable.song_xanny, "https://open.spotify.com/track/4QIo4oxwzzafcBWkKjDpXY?si=O7q1F8n4Q9uAdJTzfCvdwg", "https://music.youtube.com/watch?v=GbjwfQG_N_Y&feature=gws_kp_track"),
                    Song("you should see me in a crown", "3:01", R.drawable.song_you_should_see_me_in_a_crown, "https://open.spotify.com/track/3XF5xLJHOQQRbWya6hBp7d?autoplay=true", "https://music.youtube.com/watch?v=K6xBwcQTGac&feature=gws_kp_track"),
                    Song("all the good girls go to hell", "2:49", R.drawable.song_all_the_good_girls_go_to_hell, "https://open.spotify.com/track/66rJrQKEfSPkGaffhtRRFu?autoplay=true", "https://music.youtube.com/watch?v=s_IwrqvM618&feature=gws_kp_track"),
                    Song("wish you were gay", "3:42", R.drawable.song_wish_you_were_gay, "https://open.spotify.com/track/3Fj47GNK2kUF0uaEDgXLaD?si=Myx0YDmqSpi-pbjzofQx7A", "https://music.youtube.com/watch?v=z0_zOC20jbM&feature=gws_kp_track"),
                    Song("when the party\'s over", "3:16", R.drawable.song_when_the_party_over, "https://open.spotify.com/track/43zdsphuZLzwA9k4DJhU0I?autoplay=true", "https://music.youtube.com/watch?v=5DcrRJI_H04&feature=gws_kp_track"),
                    Song("8", "2:53", R.drawable.song_8, "https://open.spotify.com/track/6X29iaaazwho3ab7GNue5r?autoplay=true", "https://music.youtube.com/watch?v=OZYd9JxithE&feature=gws_kp_track"),
                    Song("my strange addiction", "3:00", R.drawable.song_my_strange_addiction, "https://open.spotify.com/track/3Tc57t9l2O8FwQZtQOvPXK?si=vMWgddsqS5a0_PdDN9JA-A", "https://music.youtube.com/watch?v=k1ATPhkVWi0&feature=gws_kp_track"),
                    Song("bury a friend", "3:13", R.drawable.song_bury_a_friend, "https://open.spotify.com/track/4SSnFejRGlZikf02HLewEF?autoplay=true", "https://music.youtube.com/watch?v=YFervpMG_sM&feature=gws_kp_track"),
                    Song("ilomilo", "2:36", R.drawable.song_ilomilo, "https://open.spotify.com/track/7qEKqBCD2vE5vIBsrUitpD?si=3XYufvNLTquywniGzdoTag", "https://music.youtube.com/watch?v=WiinVuzh4DA&feature=gws_kp_track"),
                    Song("listen before i go", "4:03", R.drawable.song_listen_before_i_go, "https://open.spotify.com/track/0tMSssfxAL2oV8Vri0mFHE?si=ElfZlqSBS4yoP3_Q77UqEQ", "https://music.youtube.com/watch?v=P4z1O3miesI&feature=gws_kp_track"),
                    Song("i love you", "4:52", R.drawable.song_i_love_you, "https://open.spotify.com/track/6CcJMwBtXByIz4zQLzFkKc?si=zQzq1e7NT2uEFSwaLNtT2g", "https://music.youtube.com/watch?v=WiinVuzh4DA&feature=gws_kp_track"),
                    Song("goodbye", "1:59", R.drawable.song_goodbye, "https://open.spotify.com/track/3LgWsmilsrWXiPYQFRD0T7?si=0R5mWTX9SiKQAqNG3B7OmA", "https://music.youtube.com/watch?v=vciZvVJyNYU&feature=gws_kp_track")
                ),
                "42 Minutes",
                R.drawable.album_when_we_all_fall_asleep
            )
        ),
        // Bad Bunny Album Lists
        arrayListOf(
            Album(
                "El Último Tour Del Mundo",
                LocalDate.of(2020, 11, 27),
                arrayListOf(
                    Song("EL MUNDO ES MÍO", "2:45", R.drawable.song_el_mundo_es_mio, "https://open.spotify.com/track/36DHxTW2xdr9GG15T9oK9L?autoplay=true", "https://music.youtube.com/watch?v=iMwwfP7EB9I&feature=gws_kp_track"),
                    Song("TE MUDASTE", "2:10", R.drawable.song_te_mudaste, "https://open.spotify.com/track/5RubKOuDoPn5Kj5TLVxSxY?autoplay=true", "https://music.youtube.com/watch?v=gPH161ccsUY&feature=gws_kp_track"),
                    Song("HOY COBRÉ", "2:42", R.drawable.song_hoy_cobre, "https://open.spotify.com/track/0tjZv2hChdHZCW1zFXpy1J?autoplay=true", "https://music.youtube.com/watch?v=HgouLFa0XvA&feature=gws_kp_track"),
                    Song("MALDITA POBREZA", "3:34", R.drawable.song_maldita_pobreza, "https://open.spotify.com/track/0Lsis3LB0XAK6XlTHXaJk2?autoplay=true", "https://music.youtube.com/watch?v=lvKuBbhTuvo&feature=gws_kp_track"),
                    Song("LA NOCHE DE ANOCHE", "3:23", R.drawable.song_la_noche_de_anoche, "https://open.spotify.com/track/2XIc1pqjXV3Cr2BQUGNBck?autoplay=true", "https://music.youtube.com/watch?v=0jmAwrqNudw&feature=gws_kp_track"),
                    Song("TE DESEO LO MEJOR", "2:20", R.drawable.song_te_deseo_lo_mejor, "https://open.spotify.com/track/23XjN1s3DZC8Q9ZwuorYY4?autoplay=true", "https://music.youtube.com/watch?v=-D0BEeTFbSg&feature=gws_kp_track"),
                    Song("Yo Visto Así", "3:12", R.drawable.song_yo_visto_asi, "https://open.spotify.com/track/5fROvzNghPid8mbKNDYvpJ?autoplay=true", "https://music.youtube.com/watch?v=73lHzPdtkLs&feature=gws_kp_track"),
                    Song("HACIENDO QUE ME AMAS", "3:38", R.drawable.song_haciendo_que_me_amas, "https://open.spotify.com/track/26QApq0cuO9brJigr0C0W4?autoplay=true", "https://music.youtube.com/watch?v=mreA0Xxbcyw&feature=gws_kp_track"),
                    Song("BOOKER T", "2:36", R.drawable.song_booker_t, "https://open.spotify.com/track/26w9NTiE9NGjW1ZvIOd1So?autoplay=true", "https://music.youtube.com/watch?v=wyLxnMav4TI&feature=gws_kp_track"),
                    Song("LA DROGA", "2:42", R.drawable.song_la_droga, "https://open.spotify.com/track/67ACYA3UI6QMNtHX6b34wX?autoplay=true", "https://music.youtube.com/watch?v=Mb7PcCBkWho&feature=gws_kp_track"),
                    Song("DÁKITI", "3:25", R.drawable.song_dakiti, "https://open.spotify.com/track/4MzXwWMhyBbmu6hOcLVD49?autoplay=true", "https://music.youtube.com/watch?v=-wf4Ht7jAk8&feature=gws_kp_track"),
                    Song("TRELLAS", "2:38", R.drawable.song_trellas, "https://open.spotify.com/track/09WAnxdBuebQopKhJT3oZS?autoplay=true", "https://music.youtube.com/watch?v=oDHFeHidhQo&feature=gws_kp_track"),
                    Song("SORRY PAPI", "2:43", R.drawable.song_sorry_papi, "https://open.spotify.com/track/5jZ32WOU7sqzDYbzINwMUk?autoplay=true", "https://music.youtube.com/watch?v=lZM02A6_oV4&feature=gws_kp_track"),
                    Song("120", "2:32", R.drawable.song_120, "https://open.spotify.com/track/3KJ3opyV29269SXkPrc19l?autoplay=true", "https://music.youtube.com/watch?v=19y35jAcG6k&feature=gws_kp_track"),
                    Song("ANTES QUE SE ACABE", "3:41", R.drawable.song_antes_que_se_acabe, "https://open.spotify.com/track/7kjEqI6eZ7YlFrGhxixnlN?autoplay=true", "https://music.youtube.com/watch?v=dbR28mrGQIo&feature=gws_kp_track"),
                    Song("CANTARES DE NAVIDAD", "3:20", R.drawable.song_el_mundo_es_mio, "https://open.spotify.com/track/2Iv6YBslkxslMJQsxshZh5?autoplay=true", "https://music.youtube.com/watch?v=C5Zah_DmC6A&feature=gws_kp_track")
                ),
                "47 Minutes",
                R.drawable.album_el_ultimo_tour_del_mundo
            )
        ),
        // Maroon 5 Album Lists
        arrayListOf(
            Album(
                "V",
                LocalDate.of(2014, 8, 29),
                arrayListOf(
                    Song("Maps", "3:10", R.drawable.song_maps, "https://open.spotify.com/track/58Qk7sBcenDqSSKyPcerPV?autoplay=true", "https://music.youtube.com/watch?v=WtsJ8wDwtuA&feature=gws_kp_track"),
                    Song("Animals", "3:51", R.drawable.song_animals, "https://open.spotify.com/track/6MUQRHXQAoymS7vnKQvsFd?autoplay=true", "https://music.youtube.com/watch?v=1tAUocyekt8&feature=gws_kp_track"),
                    Song("It Was Always You", "4:00", R.drawable.song_it_was_always_you, "https://open.spotify.com/track/5gpFi9JLeoAQncNzzGnnN4?autoplay=true", "https://www.youtube.com/watch?v=UWlV62bO5ok"),
                    Song("Unkiss Me", "3:58", R.drawable.song_unkiss_me, "https://open.spotify.com/track/1P495QP4sdUyeNwhXEZoSX?autoplay=true", "https://www.youtube.com/watch?v=1kztaAhVkcs"),
                    Song("Sugar", "3:55", R.drawable.song_sugar, "https://open.spotify.com/track/494OU6M7NOf4ICYb4zWCf5?autoplay=true", "https://www.youtube.com/watch?v=09R8_2nJtjg"),
                    Song("Leaving California", "3:23", R.drawable.song_leaving_california, "https://open.spotify.com/track/2fjX4GbgdYcpqTzCtAoLmU?autoplay=true", "https://music.youtube.com/watch?v=d3Ha3NHI4dI&feature=gws_kp_track"),
                    Song("In Your Pocket", "3:39", R.drawable.song_in_your_pocket, "https://open.spotify.com/track/3YaCLfEusjvGapItpokPPF?autoplay=true", "https://www.youtube.com/watch?v=TCRxpMEtE_E"),
                    Song("New Love", "3:17", R.drawable.song_new_loves, "https://open.spotify.com/track/36oXJgMw917bhXdD6f7VBT?autoplay=true", "https://music.youtube.com/watch?v=Lc3d8nKBDUk&feature=gws_kp_track"),
                    Song("Coming Back For You", "3:47", R.drawable.song_coming_back_for_you, "https://open.spotify.com/track/5nDwzrdyAGMvOzdoofovvj?autoplay=true", "https://www.youtube.com/watch?v=iLnVG_JMu2A"),
                    Song("Feelings", "3:15", R.drawable.song_feelings, "https://open.spotify.com/track/0plAYelfnt9ZLCzbyRUEpP?si=8pZEyXWYTbWH1_X2S5s78g", "https://www.youtube.com/watch?v=TQKC_nrhHmE"),
                    Song("My Heart Is Open", "3:57", R.drawable.song_my_heart_is_open, "https://open.spotify.com/track/3KYpb7zklUM6tjWvbc8Kfb?si=URbcHLoTRLmFNQ-mi4-QBw", "https://www.youtube.com/watch?v=V_kvy7s4-ng"),
                    Song("This Summer", "3:44", R.drawable.song_this_summer, "https://open.spotify.com/track/3vncluU9e0z6mdXt8hRP37?si=WyHLyT0jSES0CXKB59A1Ig", "https://www.youtube.com/watch?v=Wa64gOwuIyE"),
                    Song("Shoot Love", "3:10", R.drawable.song_shoot_love, "https://open.spotify.com/track/4ErxH2OAeKYngfxYT8EI2S?si=a54hNlm5Qba9Pjk9ygCjcA", "https://www.youtube.com/watch?v=pQQVD0_3tqk"),
                    Song("Sex and Candy", "4:25", R.drawable.song_sex_and_candy, "https://open.spotify.com/track/4r5ZfnXb1nnXgzYZ28OZgY?si=04pKzOkER2uS1w0UgvjRSw", "https://www.youtube.com/watch?v=huSap4F9Q5g"),
                    Song("Lost Stars", "4:28", R.drawable.song_lost_stars, "https://open.spotify.com/track/1Duym1lVQurgKHHSqpOWhY?si=jFDRVSHXRwmeZjVXReIlBA", "https://www.youtube.com/watch?v=_wfITSWXjpU")
                ),
                "1 Hour 18 Minutes",
                R.drawable.album_v
            )
        )
    )

    private val artistProfileImages = arrayListOf(
        R.drawable.artist_the_weeknd,
        R.drawable.artist_dua_lipa,
        R.drawable.artist_justin_bieber,
        R.drawable.artist_ariana_grande,
        R.drawable.artist_ed_sheeran,
        R.drawable.artist_j_balvin,
        R.drawable.artist_drake,
        R.drawable.artist_billie_eilish,
        R.drawable.artist_bad_bunny,
        R.drawable.artist_maroon_5
    )

    private val artistMonthlyListener = arrayListOf(
        75386717L, 63716054L, 63560218L, 61377837L, 56124618L, 56731199L, 53302968L, 48773817L, 48139787L, 47607660L
    )

    val listData: ArrayList<Artist>
        get() {
            val list = arrayListOf<Artist>()
            for (position in artistNames.indices) {
                val artist = Artist(
                    name = artistNames[position],
                    genres = artistGenres[position],
                    bio = artistBios[position],
                    albums = artistAlbums[position],
                    profileImage = artistProfileImages[position],
                    monthlyListener = artistMonthlyListener[position]
                )
                list.add(artist)
            }
            return list
        }
}
