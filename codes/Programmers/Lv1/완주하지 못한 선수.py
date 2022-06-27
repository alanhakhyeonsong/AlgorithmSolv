from collections import defaultdict

def solution(participant, completion):
    answer = ''
    participant_d = defaultdict(int)
    for p in participant:
        participant_d[p] += 1

    for c in completion:
        participant_d[c] -= 1

    for key, value in participant_d.items():
        if value != 0:
            answer = key

    return answer


participant = ["mislav", "stanko", "mislav", "ana"]
completion = ["stanko", "ana", "mislav"]
# result: "mislav"

print(solution(participant, completion))