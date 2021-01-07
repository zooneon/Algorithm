import Foundation

func solution(_ array:[Int], _ commands:[[Int]]) -> [Int] {
    // 결과를 저장할 배열
    var result = [Int]()
    // commands를 순회하여 배열에 결과를 저장
    for command in commands {
        let i = command[0] - 1
        let j = command[1] - 1
        let k = command[2] - 1
        
        let sliced = array[i...j]
        let sorted = sliced.sorted()
        result.append(sorted[k])
    }
    
    return result
}
