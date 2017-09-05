/*****************************************
* My 4th swift code example
* Subscripts
*****************************************/

struct TimesTable {
   let multiplier: Int
   subscript(index: Int) -> Int {
      return multiplier * index
   }
}
let threeTimesTable = TimesTable(multiplier: 3)
print("threeTimesTable[5] : \(threeTimesTable[5])\n")
// prints "15"

/* 
A Matrix is a good example how a subscript is used.
The following example defines a Matrix structure, which represents a two-dimensional matrix of Double values. The subscript takes two integer parameters:
*/
struct Matrix {
  let rows: Int, columns: Int
  var grid: [Double]
  init(rows: Int, columns: Int) {
     self.rows = rows
     self.columns = columns
     //grid = Array(count: rows * columns, repeatedValue: 0.0)
     //바뀐 Syntax로는 아래와 같이 써야 함
     grid = Array(repeating: 0.0, count: rows * columns)
  }
  subscript(row: Int, column: Int) -> Double {
     get {
        return grid[(row * columns) + column]
     }
     set {
        grid[(row * columns) + column] = newValue
     }
  }
}

var matrix = Matrix(rows: 2, columns: 2)
matrix[0, 1] = 1.5
matrix[1, 0] = 3.2
print("matrix : \(matrix)") //matrix에 저장된 값 출력
/* 출력 결과는 아래와 같다.
matrix : Matrix(rows: 2, columns: 2, grid: [0.0, 1.5, 3.2000000000000002, 0.0])
*/