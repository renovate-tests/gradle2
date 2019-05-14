
plugins {
    // Top level plugins
    id("build-announcements"
    id("com.github.kt3k.coveralls") version "2.8.2"
    id("com.moowork.node") version "1.3.1"
    id("net.researchgate.release") version "2.7.0"
    // Records all tasks in task graph, generates `build/reports/visteg.dot`
    // dot file can be converted to an image using graphviz. `dot -Tsvg -O -v visteg.dot`
    id("cz.malohlava") version "1.0.3"

    // Sub project plugins
    id("com.github.sherter.google-java-format") version "0.8" apply false
    id("nebula.lint") version "11.5.0" apply false
    id("net.ltgt.errorprone") version "0.8" apply false
}
