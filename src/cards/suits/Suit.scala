package cards.suits

import cards.CardSpec

abstract class Suit private[suits] extends CardSpec {
  val alternateCharacter: Char

}
