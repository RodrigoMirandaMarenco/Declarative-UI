package com.rmiranda.androidjetpackcompose.data.model

data class Talk(
        val title: String,
        val description: String,
        val pictureUrl: String,
        val speaker: Speaker
) {
    companion object {
        fun dummyTalks() = listOf(
                Talk(
                        title = "Making your iOS App Accessible",
                        description =
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris risus urna, fermentum et aliquet vitae, tincidunt et felis. Cras semper eros non lorem hendrerit maximus. Suspendisse et laoreet quam.",
                        pictureUrl = "https://picsum.photos/500/300?image=1035",
                        speaker = Speaker(
                                name = "James Wankoviac",
                                pictureUrl =
                                "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-6.jpg"
                        )
                ),
                Talk(
                        title = "The sound of JavaScript",
                        description =
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris risus urna, fermentum et aliquet vitae, tincidunt et felis. Cras semper eros non lorem hendrerit maximus. Suspendisse et laoreet quam.",
                        pictureUrl = "https://picsum.photos/500/300?image=1011",
                        speaker = Speaker(
                                name = "Rita Walsh",
                                pictureUrl =
                                "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-8.jpg"
                        )
                ),
                Talk(
                        title = "The magic of Dependency Injection",
                        description =
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris risus urna, fermentum et aliquet vitae, tincidunt et felis. Cras semper eros non lorem hendrerit maximus. Suspendisse et laoreet quam.",
                        pictureUrl = "https://picsum.photos/500/300?image=100",
                        speaker = Speaker(
                                name = "Diana Hill",
                                pictureUrl =
                                "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-5.jpg"
                        )
                ),
                Talk(
                        title = "Angular Testing",
                        description =
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris risus urna, fermentum et aliquet vitae, tincidunt et felis. Cras semper eros non lorem hendrerit maximus. Suspendisse et laoreet quam.",
                        pictureUrl = "https://picsum.photos/500/300?image=1002",
                        speaker = Speaker(
                                name = "Josh Mha",
                                pictureUrl =
                                "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-4.jpg"
                        )
                ),
                Talk(
                        title = "Laravel - OAuth",
                        description =
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris risus urna, fermentum et aliquet vitae, tincidunt et felis. Cras semper eros non lorem hendrerit maximus. Suspendisse et laoreet quam.",
                        pictureUrl = "https://picsum.photos/500/300?image=1018",
                        speaker = Speaker(
                                name = "Kiara Utz",
                                pictureUrl =
                                "https://images.generated.photos/c1z4QKwP-KrvZ1mQYGVSciFubvLD7S12cNlGsvemVk0/rs:fit:512:512/Z3M6Ly9nZW5lcmF0/ZWQtcGhvdG9zL3Yz/XzA5MTk5NjguanBn.jpg"
                        )
                ),
                Talk(
                        title = "Nest JS: The Big Picture",
                        description =
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris risus urna, fermentum et aliquet vitae, tincidunt et felis. Cras semper eros non lorem hendrerit maximus. Suspendisse et laoreet quam.",
                        pictureUrl = "https://picsum.photos/500/300?image=1033",
                        speaker = Speaker(
                                name = "Hector Fuentes",
                                pictureUrl =
                                "https://images.generated.photos/lZtzErbFWitHp8X44Uv14GOIqENA_aqEQVhAgaNTOBE/rs:fit:512:512/Z3M6Ly9nZW5lcmF0/ZWQtcGhvdG9zL3Yz/XzA1MTA4NTkuanBn.jpg"
                        )
                ),
                Talk(
                        title = "Azure PAAS Services",
                        description =
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris risus urna, fermentum et aliquet vitae, tincidunt et felis. Cras semper eros non lorem hendrerit maximus. Suspendisse et laoreet quam.",
                        pictureUrl = "https://picsum.photos/500/300?image=1040",
                        speaker = Speaker(
                                name = "Andrea Barrientos",
                                pictureUrl =
                                "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-7.jpg"
                        )
                ),
                Talk(
                        title = "AWS Serverless CI/CD",
                        description =
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris risus urna, fermentum et aliquet vitae, tincidunt et felis. Cras semper eros non lorem hendrerit maximus. Suspendisse et laoreet quam.",
                        pictureUrl = "https://picsum.photos/500/300?image=1047",
                        speaker = Speaker(
                                name = "Mike Mars",
                                pictureUrl =
                                "https://images.generated.photos/pmb8-ABvccZAWpxEjghXrXGM7WlfUPS5zEzh_0xJA88/rs:fit:512:512/Z3M6Ly9nZW5lcmF0/ZWQtcGhvdG9zL3Yz/XzA0NzMxODYuanBn.jpg"
                        )
                ),
                Talk(
                        title = "Infrastructure as Code and how you can use Terraform",
                        description =
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris risus urna, fermentum et aliquet vitae, tincidunt et felis. Cras semper eros non lorem hendrerit maximus. Suspendisse et laoreet quam.",
                        pictureUrl = "https://picsum.photos/500/300?image=1043",
                        speaker = Speaker(
                                name = "Claudia Gluz",
                                pictureUrl =
                                "https://images.generated.photos/sJmfexksXWxFw3lTbNsW4fPSIyalcbmwBTn-dqGnTJ4/rs:fit:512:512/Z3M6Ly9nZW5lcmF0/ZWQtcGhvdG9zL3Yz/XzAyNTYzNzEuanBn.jpg"
                        )
                ),
                Talk(
                        title = "Building With Bricks",
                        description =
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris risus urna, fermentum et aliquet vitae, tincidunt et felis. Cras semper eros non lorem hendrerit maximus. Suspendisse et laoreet quam.",
                        pictureUrl = "https://picsum.photos/500/300?image=129",
                        speaker = Speaker(
                                name = "Jose Dufa",
                                pictureUrl =
                                "https://images.generated.photos/niVbgCeJSct6_VRbOFnVc4sHvz6_4TzWbNVy3h3BFzE/rs:fit:512:512/Z3M6Ly9nZW5lcmF0/ZWQtcGhvdG9zL3Yz/XzAxNTA4NDYuanBn.jpg"
                        )
                )
        )
    }
}