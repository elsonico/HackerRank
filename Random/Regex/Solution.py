#!/usr/bin/env python

import re

Regex_Pattern = r'hackerrank'

Test_String = raw_input()

match = re.findall(Regex_Pattern, Test_String)

print("Number of matches:", len(match))
