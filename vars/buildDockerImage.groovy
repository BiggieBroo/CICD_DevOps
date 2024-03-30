#!/usr/bin/env groovy
import com.classes.Docker

def call(String imageName) {
	return new Docker(this).buildDockerImage(imageName)
}