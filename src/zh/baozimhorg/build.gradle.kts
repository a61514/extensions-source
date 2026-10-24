import io.github.keiyoushi.gradle.api.ContentWarning

plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "包子漫画(自建)"
    versionCode = 36
    contentWarning = ContentWarning.SAFE
    libVersion = "1.6"
    theme = "goda"

    source {
        name = "包子漫画(自建)"
        lang = "zh"
        baseUrl {
            mirrors(
"https://baozimh.org",
"https://godamh.com",
"https://bzmh.org",
"https://m.baozimh.one",
            )
        }
        id = 774030471139699415L
    }
}
