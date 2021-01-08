import Foundation

func solution(_ citations:[Int]) -> Int {
    // 최댓값을 구하기 위해 역정렬 시킴
    let sorted = citations.sorted(by: >)
    // h는 배열의 크기보다 무조건 작거나 같아야함
    for h in (1...sorted.count).reversed() {
        if sorted[h-1] >= h {
            return h
        }
    }

    return 0
}
