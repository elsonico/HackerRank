#!/bin/bash
cat | grep \@gmail\.com | awk '{print $1}' | sort
