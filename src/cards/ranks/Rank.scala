package cards.ranks

import cards.CardSpec

abstract class Rank private[ranks] extends CardSpec {
  override val characterASCII: Char = this.character
  val numberCharacter: String = this.character.toString

}
