package sierikov.exercism.easy

object GradeSchool {
  class School {
    type DB = Map[Int, Seq[String]]

    private var students = Map.empty[Int, Seq[String]]
    def db: DB = students

    def add(name: String, g: Int): Unit = {
      students += g -> (grade(g) :+ name)
    }

    def grade(g: Int): Seq[String] = students.getOrElse(g, Seq())

    def sorted: DB = students
      .map { case (g, names) =>
        (g, names.sorted)
      }
      .toSeq
      .sortBy(_._1)
      .toMap
  }

}
