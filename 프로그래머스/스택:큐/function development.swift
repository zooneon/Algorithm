import Foundation

func solution(_ progresses:[Int], _ speeds:[Int]) -> [Int] {
    var prog = progresses
    var spds = speeds
    var result = [Int]()
    var flag = 0
    
    while !prog.isEmpty {
        // 작업에 진도를 더하고 비교
        for index in 0..<prog.count {
            prog[index] += spds[index]
        }
        // 순서대로 검사해서 작업의 진도가 100 미만일 때 멈춤
        for i in 0..<prog.count {
            if prog[i] < 100 {
                flag = i - 1
                break
            }
            // 모든 작업이 100 이상일 경우도 있음
            flag = i
        }
        
        if flag >= 0 {
            result.append(flag + 1)
            prog.removeFirst(flag + 1)
            spds.removeFirst(flag + 1)
        }
    }

    return result
}
