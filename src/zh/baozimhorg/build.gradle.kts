import io.github.keiyoushi.gradle.api.ContentWarning

plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "包子漫画(自建)"
    versionCode = 35
    contentWarning = ContentWarning.SAFE
    libVersion = "1.6"
    theme = "goda"

    source {
        name = "包子漫画(自建)"
        lang = "zh"
        baseUrl {
            mirrors(
                "https://cn.cnbzmg.com",
                "https://cn.bzmgcn.com",
                "https://www.baozimh.com",
            )
        }
        id = 774030471139699415L
    }
}
