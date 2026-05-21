from unittest import TestCase
import task_three
class task_three_test(TestCase):
    def test_that_task_three_exists(self):
        number = []
        actual = task_three.largest_to_smallest(number)
    def test_that_smallest_to_largest_works(self):
        number = [14, 9, 6, 5, 8, 10]
        actual = task_three.largest_to_smallest(number)
        expected = [5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
        assertEqual(actual, expected)
