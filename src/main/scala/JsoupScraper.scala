package dev.draft

import org.jsoup._
import scala.jdk.CollectionConverters._

object JsoupScraper {

    def main(args: Array[String]): Unit = {
        val doc = Jsoup.connect("http://en.wikipedia.org0").get()
        val inTheNews = doc.select("#mp-itn b a")
        val onThisDay = doc.select("#mp-otd b a")
        val didYouKnow = doc.select("#mp-dyk b a")
    }
}
