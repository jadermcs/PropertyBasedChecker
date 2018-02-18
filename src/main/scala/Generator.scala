object Generator {
  trait Prop {
    def check: Boolean

    def &&(p: Prop): Prop

    def ||(p: Prop): Prop
  }

  def listOf[A](a: Gen[A]): Gen[List[A]]

  def listOfN[A](n: Int, a: Gen[A]): Gen[List[A]]

  def forAll[A](a: Gen[A])(f: A => Boolean): Prop

}
