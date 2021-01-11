import Foundation

func solution(_ bridge_length:Int, _ weight:Int, _ truck_weights:[Int]) -> Int {
    var seconds = 0
    var totalWeight = 0
    var bridge = [Int](repeating: 0, count: bridge_length)
    var trucks = truck_weights

    // 트럭이 모두 다리를 건널 때까지
    while !bridge.isEmpty {
        if !trucks.isEmpty {
            totalWeight -= bridge.removeFirst()
            // 현재 다리에 있는 무게 + 추가될 무게가 견딜 수 있는 무게보다 작을 때
            if totalWeight + trucks.first! <= weight {
                let truck = trucks.removeFirst()
                totalWeight += truck
                bridge.append(truck)
                seconds += 1
            } else {
                bridge.append(0)
                seconds += 1
            }
        }
        // 대기하는 트럭이 없는 경우
        else {
            bridge.removeFirst()
            seconds += 1
        }
    }

    return seconds
}
