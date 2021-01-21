import Foundation

func solution(_ priorities:[Int], _ location:Int) -> Int {
    var priorities = priorities
    var location = location
    var count = 1
    var sorted = priorities.sorted(by: >)
    
    while !priorities.isEmpty {
        if priorities.first == sorted.first {
            // location에 해당하는 문서의 중요도가 제일 높을 경우
            if location == 0 {
                return count
            }
            
            priorities.removeFirst()
            sorted.removeFirst()
            count += 1
        }
        else {
            let first = priorities.removeFirst()
            priorities.append(first)
        }
        // location이 0보다 작아질 경우 맨 뒤로 보냄
        location = location - 1 < 0 ? priorities.count - 1 : location - 1
    }
    
    return count - 1
}
