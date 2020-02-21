class Node:
    def __init__(self, val):
        self.val = val

class Stack:
    def __init__(self):
        self.stack = []
    def is_empty(self):
        if not self.stack:
            return True
        return False
    def peek(self):
        if not self.is_empty:
            return self.stack[-1]
    def push(self, item):
        node = Node(item)
        self.stack.append(node)
    def pop(self):
        if not self.is_empty:
            return self.stack.pop()
