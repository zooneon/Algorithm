import Foundation

func solution(_ numbers:[Int]) -> String {
    // 배열 원소를 붙여서 비교함
    let sortedNumbers: [Int] = numbers.sorted {
        Int("\($0)\($1)")! > Int("\($1)\($0)")!
    }
    // 배열을 문자열로 변환
    let largestNumber = sortedNumbers.map { String($0) }.joined()
    // 배열 원소가 모두 0일때 0을 리턴
    if largestNumber.first == "0" {
        return "0"
    }
    
    return largestNumber
}

