import os
import requests
import zipfile

def download_file(url, save_path):
    # Download the file from the given URL
    response = requests.get(url, stream=True)
    with open(save_path, 'wb') as file:
        for chunk in response.iter_content(chunk_size=8192):
            file.write(chunk)
    print(f"Downloaded: {save_path}")

def extract_zip(file_path, extract_to):
    # Extract the zip file to the specified directory
    with zipfile.ZipFile(file_path, 'r') as zip_ref:
        zip_ref.extractall(extract_to)
    print(f"Extracted: {file_path} to {extract_to}")

def main():
    # Example URL of the file to be downloaded
    url = 'https://example.com/file.zip'  # Replace with the actual URL
    file_name = url.split('/')[-1]
    save_path = os.path.join('C:\\', file_name)

    # Download the file
    download_file(url, save_path)

    # Check if the file is a zip file and extract it
    if file_name.endswith('.zip'):
        extract_to = os.path.join('C:\\Extracted', file_name[:-4])
        os.makedirs(extract_to, exist_ok=True)
        extract_zip(save_path, extract_to)

if __name__ == "__main__":
    main()
