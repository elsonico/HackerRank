#!/usr/bin/env python

import re
import sys

regex_pattern = r"^...\....\....\....$"	# Do not delete 'r'.

test_string = raw_input()

match = re.match(regex_pattern, test_string) is not None

print str(match).lower()
