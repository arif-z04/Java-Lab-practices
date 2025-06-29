import os
extension = ".class"
for file in os.listdir():
    if file.endswith(extension):
        os.remove(file)
        print(f"Deleted: {file}")