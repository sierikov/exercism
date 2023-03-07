package sierikov.exercism.easy

object SpiralMatrix {
  def spiralMatrix(rank: Int): List[List[Int]] = {
    def constructMatrix(rows: Int, columns: Int, start: Int): List[List[Int]] =
      if (rows == 0) List.empty
      else {
        val monotone = (start until start + columns).toList
        monotone :: constructMatrix(columns, rows - 1, start + columns).reverse.transpose
      }

    constructMatrix(rank, rank, 1)
  }
}
