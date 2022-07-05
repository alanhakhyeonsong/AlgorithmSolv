def solution(phone_book):
    phone_book.sort()
    print(phone_book)
    for i in range(len(phone_book)-1):
        if len(phone_book[i+1]) >= len(phone_book[i]):
            if phone_book[i+1].startswith(phone_book[i]):
                return False

    return True


phone_book1 = ["119", "97674223", "1195524421"]
# result: False
phone_book2 = ["123", "456", "789"]
# result: True
phone_book3 = ["12", "123", "1235", "567", "88"]
# result: False
print(solution(phone_book1))