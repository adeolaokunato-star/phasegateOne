from unittest import TestCase
import task_one
class task_one_test(TestCase):
    def test_that_task_one_exists(self):
        array = []
        actual = task_one.check_number(array, target)
    def test_that_correct_array_comes(self):
        array = [8, 6, 12, 4, -2]
        target = 0
        actual = TaskOne.check_number(array, target)
        excepted = [8, -2]
        assertEqual(actual, expected)
