package Lv2;

import java.util.HashMap;
import java.util.Map;

//��ȭ��ȣ ���
//HashMap<String, Integer>�� �����ϸ� Key�� String ����, Value�� Integer ���·� ����
//HashMap.put(Key, Value) : Hash Map�� Key�� Value�� �� ������ �Է��ϴ� �Լ�

class listOfPhoneBook {
    public boolean solution(String[] phoneBook) {
        
        // 1. HashMap�� �����Ѵ�.
        Map<String, Integer> map = new HashMap<>();

        // 2. ��� ��ȭ��ȣ�� HashMap�� �ִ´�.
        for (int i = 0; i < phoneBook.length; i++) 
            map.put(phoneBook[i], i);
        
        // 3. ��� ��ȭ��ȣ�� substring�� HashMap�� �����ϴ��� Ȯ���Ѵ�.
        for (int i = 0; i < phoneBook.length; i++)
            for (int j = 0; j < phoneBook[i].length(); j++)
                if (map.containsKey(phoneBook[i].substring(0, j)))
                    return false;

        return true;
        
    }
}