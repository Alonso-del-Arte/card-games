package cards

import java.util.Locale

trait CardSpec {
  val character: Char
  val characterASCII: Char
  val word: String

  // PLACEHOLDER FOR INTERNATIONALIZATION
  def getWord(locale: Locale): String = this.word

}
