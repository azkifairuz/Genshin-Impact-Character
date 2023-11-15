package com.azkifairuz.genshin_impact_character.model

import com.azkifairuz.genshin_impact_character.R

data class Character(
    val id: Int,
    val image: Int,
    val name: String,
    val region: String,
    val detail: String,
)
    val listCharacter = listOf(
        Character(1,R.drawable.eula, "Eula Lawrance", "Mondstadt","Eula Seorang keturunan bangsawan yang dijuluki Spindrift Knight dan selalu ada di medan pertempuran.\n" +
                "Lahir sebagai keturunan bangsawan yang menanggung beban dosa pendahulunya, Eula memerlukan suatu keterampilan khusus untuk dapat hidup damai di bawah naungan prasangka. Oleh sebab itu, Eula sanggup memutuskan hubungan dengan klan-nya dan menjadi Spindrift Knight yang hebat, lalu memburu musuh-musuh Mondstadt di luar sebagai bentuk \"pembalasan dendam\" dirinya yang khas."),
        Character(2,R.drawable.venti,"Venti","Mondstadt","Seorang penyair yang datang bersama angin yang tidak diketahui asal-usulnya. Terkadang menyanyikan lagu yang teramat tua, dan terkadang menyanyikan lagu baru yang tidak pernah didengar."),
        Character(3,R.drawable.keqing,"Keqing","Liyue","Yuheng dari Liyue Qixing, dia memiliki banyak hal yang ingin dikatakan mengenai Rex Lapis, sang pemimpin Liyue —— dan pada kenyataannya, para dewa mengagumi orang-orang sepertinya."),
        Character(4,R.drawable.raiden,"Raiden Shogun","Inazuma","Raiden Shogun — perwujudan petir yang paling agung dan menakutkan di dunia, penguasa tertinggi Inazuma Shogunate.\n" +
                "Dengan memegang kekuatan petir, dia terus mengejar keabadian seorang diri."),
        Character(5,R.drawable.kazuha,"Kadehara Kazuha","Inazuma","Samurai pengembara dari Inazuma, bersifat lemah lembut dan rendah hati.\n" +
                "Di balik penampilannya yang muda dan cuek ternyata tersembunyi banyak kepahitan masa lalu. Meski selalu terlihat santai, dia memiliki prinsip tersendiri dalam bertindak."),
        Character(6,R.drawable.heizou,"Heizou","Inazmua","Seorang detektif muda dari Tenryou Commission. Memiliki intuisi yang kuat dan pemikiran yang tajam. Tidak peduli apa pun kasus yang dia hadapi, dia dapat menemukan kebenarannya dengan cara yang tak terduga."),
        Character(7,R.drawable.nahida,"Nahida","Sumeru","Lesser Lord Kusanali yang tinggal di Sanctuary of Surasthana, selalu dipandang remeh dan jarang dibicarakan orang-orang. \n" +
                "Dia memikul beban yang berat, meskipun selalu diselimuti dalam kegelapan dan kesepian, dia tidak pernah berhenti melangkah maju."),
        Character(8,R.drawable.nilou,"Nilou","Sumeru","Bintang Teater Zubayr, seorang penari yang anggun seperti bunga teratai yang baru mekar tanpa sedikit pun noda.\n Namun, dia sama sekali tidak angkuh dan dingin. Bahkan seorang petualang yang terburu-buru tidak dapat melupakan senyumnya yang tulus dan berseri-seri."),
        Character(9,R.drawable.charlotte,"Charlotte","Fontaine","Seorang reporter dari The Steambird yang selalu terlihat sangat bersemangat. Ia tidak pernah berhenti berlari ke sana kemari untuk mencari \"kebenaran\"."),
        Character(10,R.drawable.neuvillate,"Neuvillete","Fontaine","Sang Iudex Fontaine bisa dibilang adalah seseorang yang \"sulit didekati\". Entah karena sifatnya, atau karena ada rahasia yang disembunyikannya.")
    )

